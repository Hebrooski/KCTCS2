package com.ntier.races;

import java.util.ArrayList;

import com.ntier.athletics.Person;
import com.ntier.cycles.Bike;
import com.ntier.cycles.Hoverbike;

public class RaceTrack {

	Person race(ArrayList<Bike> racers) {
		Bike winner = null;
		for (Bike racer : racers) {
			if (winner == null)
				winner = racer;
			if (racer.go()) {
				if (racer.getSpeed() > winner.getSpeed())
					winner = racer;
			}
		}
		return winner.getRider();

	}

	Person flyRace(ArrayList<Bike> racers) {
		Bike winner = null;
		for (Bike racer : racers) {
			if (winner == null)
				winner = racer;
			if (racer instanceof Hoverbike) {
				if (((Hoverbike) racer).fly(15, racer.getSpeed())) {
					if (racer.getSpeed() > winner.getSpeed())
						winner = racer;
				}
			}
		}
		return winner.getRider();
	}

}
