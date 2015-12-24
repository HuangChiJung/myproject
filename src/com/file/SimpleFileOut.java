package com.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleFileOut {

	public static void main(String[] args) throws IOException {
//		writeFile();
//		readFile();
		//bufferedReaderFile();
		Scanner scanner = new Scanner(System.in);
		int sum =0;
		for (int i = 0; i < 10; i++) {
			System.out.println("input :");
			String s = scanner.nextLine();

			try {
				int score = Integer.parseInt(s);
				sum = sum + score;
				System.out.println("Time "+i+" Total : "+sum);
			} catch (NumberFormatException e) {
				System.out.println("NumberFormatException and input again!");
			}
		}
		
		try{
			int n = 0/1;
			
		}catch(ArithmeticException e){
			System.out.println("分母不為零");
		}
	}

	private static void bufferedReaderFile() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("data.txt");
		BufferedReader in = new BufferedReader(fr);  //串接
		String line;
		line = in.readLine();
		while(line!=null){
			System.out.println(line);
			line = in.readLine();
		}
		in.close();
	}

	private static void readFile() throws FileNotFoundException, IOException {
		FileReader in = new FileReader("data.txt");
		int d=0;
		
		while(d!=-1){
			d = in.read();
			System.out.println((char)d);
		}
		in.close();
	}

	private static void writeFile() throws IOException {
		FileWriter out = new FileWriter("data.txt");
 
		out.write("12 54987痾|~ㄎ赊");
		out.flush();
		out.close();
	}

}
