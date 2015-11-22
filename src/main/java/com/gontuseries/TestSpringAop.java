package com.gontuseries;

import com.gontuseries.springaop.Actual;
import com.gontuseries.springaop.Operation;
import com.gontuseries.springaop.Validator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
public class TestSpringAop {

	@SuppressWarnings("resource")
	public static void myMain() {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		((AbstractApplicationContext) context).registerShutdownHook();

//	Actual a = (Actual) context.getBean("proxy");
//	a.actual();
//	Validator v = context.getBean("proxynew", Validator.class);
//
//	try {
//		v.validate(10);
//	} catch (Exception ex) {
//		Logger.getLogger(TestSpringAop.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
//	}
		Operation o = context.getBean("Operation", Operation.class);
		System.out.println("calling msg...");
		o.msg();
		System.out.println("calling m...");
		o.m();
		System.out.println("calling k...");
		o.k();
		System.out.println("calling validate...");
		try {
			o.validate(2);
		} catch (Exception ex) {
			Logger.getLogger(TestSpringAop.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
		}
	}
}
