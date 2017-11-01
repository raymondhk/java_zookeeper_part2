package com.codingdojo.projectone;

public class Mammal {
	protected Integer energyLevel = 100;
	
	Integer displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
}
