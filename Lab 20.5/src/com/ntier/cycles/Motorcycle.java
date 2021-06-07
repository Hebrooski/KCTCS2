package com.ntier.cycles;

public class Motorcycle extends Bike {
	
	Motorcycle(){
		super(Math.round(Math.random()*65),2);
	}
	
	public boolean go() {
		boolean going = false;
		if(getRider() != null) {
			going = true;
			System.out.printf("%s drives at %f mph",getRider().getName(),getSpeed());
		}else {
			System.out.println("No rider, cannot go.");
		}
		return going;
	}
}
