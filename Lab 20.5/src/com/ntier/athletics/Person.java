package com.ntier.athletics;

public class Person implements StudentAthlete {

	private String name;
	private int hoursInDay = 24;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String nameIn) {
		name = nameIn;
	}

	private void nextDay() {
		hoursInDay += 24;
		System.out.println("Next day");
		System.out.printf("%d hours left in new day", hoursInDay);
	}

	@Override
	public void study(int hours) {
		System.out.printf("%s studied for %d hours", name, hours);
		hoursInDay -= hours;
		if (hoursInDay < 0)
			nextDay();
	}

	@Override
	public void practice(int hours) {
		System.out.printf("%s practiced for %d hours", name, hours);
		hoursInDay -= hours;
		if (hoursInDay < 0)
			nextDay();
	}

	@Override
	public void sleep(int hours) {
		System.out.printf("%s slept for %d hours", name, hours);
		hoursInDay -= hours;
		if (hoursInDay < 0)
			nextDay();
	}

}
