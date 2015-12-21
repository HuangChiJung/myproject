package com.parking;

import java.util.Date;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		System.out.println(date.getTime());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input time:");
		
		String time = scanner.nextLine();
		
		System.out.println("input car number");
		String plate = scanner.nextLine();
		
		
	}

}
