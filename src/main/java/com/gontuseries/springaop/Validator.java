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
public class Validator {

	public void validate(int age) throws Exception {
		if (age < 18) {
			throw new Exception("not eligible to vote");
		} else {
			System.out.println("vote confirmed");
		}
	}
}
