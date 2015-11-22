package com.gontuseries;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gontuseries.springhibernate.Employee;
import com.gontuseries.springhibernate.EmployeeDao;

public class TestSpringHibernate {
	@SuppressWarnings("resource")
	public static void mymain() {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		EmployeeDao dao = (EmployeeDao) context.getBean("d");
		
		List<Employee> list = dao.getEmployees();
		Iterator<Employee> iterator = list.iterator();
		while (iterator.hasNext()) {            
			Employee e = (Employee) iterator.next();
			System.out.println(e.getId()+":"+e.getName()+":"+e.getSalary());
		}
		
		Employee e = (Employee) dao.getById(0);
		System.out.println(e.getId()+":"+e.getName()+":"+e.getSalary());
	}
}
