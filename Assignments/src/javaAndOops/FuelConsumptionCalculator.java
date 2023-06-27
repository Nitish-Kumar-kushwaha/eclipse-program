package javaAndOops;

import java.util.*;
import java.lang.*;

public class FuelConsumptionCalculator {
	
	public static void calculateFuelConsumption(int fuel, int distance) {
		// for distance/fuel
		float distFuel = ((((float)fuel*100)/(float)distance));
		System.out.printf("you need a sum od Rs %.2f to cover the trip",distFuel);
		//for fuel/distance 
		System.out.println();
		float fuelDist = ((distance*((float)0.6214))/(fuel*((float)0.2642)));
		System.out.printf("you need a sum od Rs %.2f to cover the trip",fuelDist);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank");
		int fuel = sc.nextInt();
		if(fuel <=0) {
			System.out.println("invalid input");
			System.exit(0);
		}
		
		int dist = sc.nextInt();
		if(dist <=0) {
			System.out.println("invalid input");
			System.exit(0);
		}
		
		calculateFuelConsumption(fuel,dist);

	}

}
