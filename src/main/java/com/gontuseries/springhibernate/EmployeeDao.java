/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gontuseries.springhibernate;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.FlushMode;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vivekbhawsar
 */
@Transactional(readOnly = false)
public class EmployeeDao {
    HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return template;
    }
    
    public void setTemplate(HibernateTemplate template){
//        template.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
        this.template = template;
    }
    
    public void saveEmployee(Employee e){
        template.save(e);
    }
    
    public void updateEmployee(Employee e){
        template.update(e);
    }
    
    public void deleteEmployee(Employee e){
        template.delete(e);
    }
    
    public Employee getById(int id){
        Employee e = (Employee) template.get(Employee.class, id);
        return e;
    }
    
    public List<Employee> getEmployees(){
        List<Employee> list = new ArrayList<Employee>();
        list = template.loadAll(Employee.class);
        return list;
    }
}
