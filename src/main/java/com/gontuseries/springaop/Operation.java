/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gontuseries.springaop;

/**
 *
 * @author Admin
 */
public class Operation {

	public void msg() {
		System.out.println("msg invoked");
	}

	public int m() {
		System.out.println("m invoked");
		return 2;
	}

	public int k() {
		System.out.println("k invoked");
		return 3;
	}

	public void validate(int age) throws Exception {
		System.out.println("validate invoked");
		if (age < 18) {
			throw new ArithmeticException("Not valid age");
		} else {
			System.out.println("Thanks for vote");
		}
	}
}
