package com.gontuseries.springcore;

public class Tea implements IHotDrink {

	public void prepareHotDrink() {
		System.out.println("we are making hot drink : "+this.getClass().getSimpleName());
	}

}
