package com.ibm;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Random r = new Random();

		int[] n = new int[4];
		int counter=0;
		boolean allSix = false;
		int sum =0;
		while(!allSix){
			counter++;
			sum =0;
			System.out.println("Time: "+counter);
			for (int i = 0; i < 4; i++) {
				n[i] = r.nextInt(6) + 1;
				System.out.print(n[i] + " ");
				sum=sum+n[i];
			}
			if(n[0]==n[1]||
			   n[0]==n[2]||
			   n[0]==n[3]||
			   n[1]==n[2]||
			   n[1]==n[3]||
			   n[2]==n[3])	System.out.println(" two pair");
			if(sum==24)	allSix = true;
			
			System.out.println("\r\n*******");
		}
		
		System.out.println("Total Counter "+ counter);
	}
}
