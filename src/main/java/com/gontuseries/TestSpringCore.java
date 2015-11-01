package com.gontuseries;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gontuseries.springcore.Restaurant;

public class TestSpringCore {
	
	@SuppressWarnings("resource")
	public static void myMain() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		((AbstractApplicationContext) context).registerShutdownHook();
		
		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean");
		
		restaurant.greetCustomer();
	}
}
