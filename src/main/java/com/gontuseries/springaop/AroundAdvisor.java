/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gontuseries.springaop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 *
 * @author Admin
 */
public class AroundAdvisor implements MethodInterceptor {

	public Object invoke(MethodInvocation mi) throws Throwable {
		Object obj;

		System.out.println("additional concern before actual logic");

		obj = mi.proceed();

		System.out.println("additional concern after actual logic");

		return obj;
	}

}
