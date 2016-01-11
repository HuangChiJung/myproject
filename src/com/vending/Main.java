package com.vending;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		VendingMachine vend = new VendingMachine();
		Scanner scanner = new Scanner(System.in);
		boolean go = true;
		boolean flag = false;
		while(go){
			System.out.println("total : "+ vend.getTotal());
			System.out.println("input coin or chiose a ,b and c  or press 0 to end");
			String line = scanner.nextLine();
			switch(line){
			case "1":
			case "5":
			case "10":
			case "50":
				vend.insertCoin(Integer.parseInt(line));
				break;
			default:
				flag = vend.select(line);
				if(flag==true){
					System.out.println("Don! you got "+ line);
				}else{
					System.out.println("Beep! Diff "+ vend.Diff(line));
					
				}
				break;
			case "0":
				go = false;
				break;
			}
		}
	}
}
