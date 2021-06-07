package com.ntier.cycles;

public class Hoverbike extends Bike {

	public Hoverbike() {
		super(Math.round(Math.random()*15),0);
	}
	
	
	public boolean go() {
		boolean going = false;
		if(getRider() != null) {
			going = true;
			System.out.printf("%s hovers at %f mph",getRider().getName(),getSpeed());
		}else {
			System.out.println("No rider, cannot go.");
		}
		return going;
	}
	
	public boolean fly(int height, double speed) {
		boolean going = false;
		if(getRider() != null) {
			going = true;
			System.out.printf("%s flys to a %d at %f mph",getRider().getName(),height,speed);
		}else {
			System.out.println("No rider, cannot go.");
		}
		return going;
	}

}
