package com.parking;

import java.util.Scanner;

public class ParkingLot {
	int rate =30;
	
	Car[] cars = new Car[50];
	
	public void enter(Car id){
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ParkingLot lot = new ParkingLot();
		System.out.println("input time:");
		String time = scanner.nextLine();
		System.out.println("input id:");
		String id = scanner.nextLine();
		
		Car c1 = new Car(id,time);
	}
}
