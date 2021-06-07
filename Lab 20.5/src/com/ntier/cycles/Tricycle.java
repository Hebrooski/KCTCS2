package com.ntier.cycles;

public class Tricycle extends Bike {
	
	Tricycle(){
		super(Math.round(Math.random()*65),3);
	}
	
	public boolean go() {
		boolean going = false;
		if(getRider() != null) {
			going = true;
			System.out.printf("%s peddles at %f mph",getRider().getName(),getSpeed());
		}else {
			System.out.println("No rider, cannot go.");
		}
		return going;
	}

}
