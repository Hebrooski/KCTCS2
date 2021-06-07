package com.ntier.cycles;

import com.ntier.athletics.Person;

public abstract class Bike implements Rideable {
	private Person rider;
	private int numOfWheels;
	private double speed;
	
	public Person getRider() {
		return rider;
	}

	public void setRider(Person rider) {
		this.rider = rider;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public Bike(double speedIn, int numOfWheelsIn) {
		numOfWheels = numOfWheelsIn;
		speed = speedIn;
	}

	public boolean mount(Person person) {
		boolean mounted = false;
		if(rider != null) {
			mounted = true;
			rider = person;
			System.out.printf("%s has mounted the Bike",person.getName());
		}else{
			System.out.printf("Failed to mount, %s has already mounted the Bike.", rider.getName());
		}
		return mounted;
	}
	
	public boolean unmount() {
		boolean unmounted = false;
		if(rider == null) {
			System.out.printf("%s has dismounted from the Bike.", rider.getName());
			rider = null;
			unmounted = true;
		}else {
			System.out.println("There is no rider to dismount.");
		}
		return unmounted;
	}
	
	public abstract boolean go();
	
}
