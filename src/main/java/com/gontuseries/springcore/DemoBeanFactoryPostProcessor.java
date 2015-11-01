package com.gontuseries.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DemoBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		
		BeanDefinition beanDefinition = arg0.getBeanDefinition("restaurantBean");
		
		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
		
		propertyValues.addPropertyValue("welcomeNote", "demo bean factory post processor");
	}

}
