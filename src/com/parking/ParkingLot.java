package com.parking;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class ParkingLot {
	int rate =30;
	
	Car[] cars = new Car[50];
	
	public void enter(Car id){
		
	}
	
	public static void main(String[] args) {
		//ng();
		ParkingLot lot = new ParkingLot();
		try {
			FileReader fr = new FileReader("parking-data.txt");
			BufferedReader in = new BufferedReader(fr);
			
			String line = in.readLine();
			while(line!=null){
				System.out.println(line);
				String[] s = line.split(",");
				System.out.println(s.length);
				
				Calendar now = Calendar.getInstance();
				System.out.println(now);
				line = in.readLine();
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	private static void ng() {
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