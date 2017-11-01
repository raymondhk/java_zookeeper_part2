package com.codingdojo.projectone;

public class Dragon {
	private Integer energyLevel = 300;
	
	public void fly() {
		System.out.println("**Whoosh** The Dragon takes off!");
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("**Chomp** There goes another human...");
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("**Crackle** ...and there goes the town...");
		this.energyLevel -= 100;
	}
	
	public Integer displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}


}
