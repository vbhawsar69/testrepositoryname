/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gontuseries.springaop;

import org.springframework.aop.ThrowsAdvice;

/**
 *
 * @author Admin
 */
public class ThrowsAdvisor implements ThrowsAdvice {

  public void afterThrowing(Exception e) {
	System.out.println("additional concern after exception occurs");
  }
}
