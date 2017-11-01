package com.codingdojo.projectone;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("The Gorilla has thrown a banana peel!");
		this.energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("The Gorilla took a break to eat a banana!");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("The Gorilla decided to go for a climb!");
		this.energyLevel -= 10;
	}
	
}
