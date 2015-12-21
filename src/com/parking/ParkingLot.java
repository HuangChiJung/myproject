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
//有一停車場，收費1小時30元，需記錄車牌、入場時間、出場時間，並算出費用。
//
//0830,8877-QQ
//0910,1234-AB
//1040,2266-XY
//1130,8877-QQ
//1400,1234-AB