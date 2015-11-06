/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gontuseries;

import com.gontuseries.springhibernate.Employee;
import com.gontuseries.springhibernate.EmployeeDao;
import java.util.Iterator;
import java.util.List;
import org.hibernate.FlushMode;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author vivekbhawsar
 */
public class TestSpringHibernate {
    public static void mymain() {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        
        EmployeeDao dao = (EmployeeDao) context.getBean("d");
        
        List<Employee> list = dao.getEmployees();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {            
            Employee e = (Employee) iterator.next();
            System.out.println(e.getId()+":"+e.getName()+":"+e.getSalary());
        }
        
        Employee e = (Employee) dao.getById(0);
        System.out.println(e.getId()+":"+e.getName()+":"+e.getSalary());
    }
}
