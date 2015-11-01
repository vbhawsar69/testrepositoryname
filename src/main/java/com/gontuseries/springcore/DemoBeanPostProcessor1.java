package com.gontuseries.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DemoBeanPostProcessor1 implements BeanPostProcessor, Ordered {

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("1 after init of : "+arg1);
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("1 before init of : "+arg1);
		return arg0;
	}

	public int getOrder() {
		return 0;
	}

}
