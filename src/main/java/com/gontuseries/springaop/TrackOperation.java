/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gontuseries.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author Admin
 */
@SuppressWarnings("unused")
@Aspect
public class TrackOperation {

	// @Pointcut("execution(* Operation.m*(..))")
	// public void beforeafter() {
	// }
	// @Before("beforeafter()")
	// @After("beforeafter()")
	// public void myadvice(JoinPoint jp) {
	// 	System.out.println("additional concern");
	// 	System.out.println(jp.getSignature());
	// }
	// @Pointcut("execution(int Operation.*(..))")
	// public void afterreturning() {
	// }
	// @AfterReturning(pointcut = "afterreturning()", returning = "result")
	// public void myadvice(JoinPoint jp, Object result) {
	// 	System.out.println("additional concern");
	// 	System.out.println("Method Signature: " + jp.getSignature());
	// 	System.out.println("Result in advice: " + result);
	// 	System.out.println("end of after returning advice...");
	// }
	// @Pointcut("execution(* Operation.*(..))")
	// public void around() {
	// }
	// @Around("around()")
	// public Object myadvice(ProceedingJoinPoint pjp) throws Throwable {
	// 	System.out.println("additional concern before actual method");
	// 	Object o = pjp.proceed();
	// 	System.out.println("additional concern after actual method");
	// 	return o;
	// }
	// @Pointcut("execution(* Operation.validate*(..))")
	// public void afterthrowing() {
	// }
	// @AfterThrowing(pointcut = "afterthrowing()", throwing = "error")
	public void myadvice(JoinPoint jp, Throwable error) {
		System.out.println("additional concern");
		System.out.println("Method Signature: " + jp.getSignature());
		System.out.println("Exception is: " + error);
		System.out.println("end of after throwing advice...");
	}
}
