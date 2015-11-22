package com.gontuseries.springcore;

import java.util.ArrayList;

public class Restaurant{
	
	private String welcomeNote;
	
	private ArrayList<String> list;
	
	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}
	
	public void greetCustomer() {
		System.out.println(list);
		
		System.out.println(welcomeNote);
		// System.out.println("welcome to our restaurant");
	}

	public void destroy(){
		System.out.println("destroy");
	}

	public void init(){
		System.out.println("init");
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	
}
