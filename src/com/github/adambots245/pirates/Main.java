package com.github.adambots245.pirates;
import com.github.adambots245.ship.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ship.pirateShips();
		System.out.println(Pirates.getRandomPiratePhrase());
	}
	
	public static void newShip() {
		System.out.println("This is a new ship \n The ship's captain is Blackbeard");
		int numberOfCannons = (int)(Math.random()*10+1);
		if (numberOfCannons == 1) {
			System.out.println("This ship is armed");
		}
		if(numberOfCannons > 1) {
			System.out.println("This ship is super armed");
		}
		
				
	}

}
