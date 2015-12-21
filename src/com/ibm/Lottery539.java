package com.ibm;

import java.util.Random;

public class Lottery539 implements Game{
	int[] numbers = new int[5];

	public Lottery539(){
		generate();
	}
	
	public Lottery539(int n1,int n2,int n3,int n4,int n5){
		numbers[0]=n1;
		numbers[1]=n2;
		numbers[2]=n3;
		numbers[3]=n4;
		numbers[4]=n5;
	}
	
	public Lottery539(int[] nums){
		this.numbers = nums;
	}
	
	@Override
	public boolean validate(){   //同一packet 可用
		int[] spots = new int[39];
	
		for(int i=0;i<5;i++){
			spots[numbers[i]-1] = 1;
		}
		int sums=0;
		for(int i=0;i<39;i++){
			sums = sums+spots[i];
		}
		
		if(sums<5)
			return false;
		else
			return true;
	}
	
	@Override
	public void generate() {
		Random r = new Random();
		boolean[] spots = new boolean[40];
		for (int i = 0; i < 5; i++) {
			int n = r.nextInt(39) + 1;

			if (spots[n]) {
				i--;
				continue;
			} else {
				numbers[i] = n;
				spots[n] = true;
			}
		}
		print();
		print_sort(spots);

		System.out.println("");

		int[] cc = new int[39];

		for (int i = 0; i < 39; i++)
			cc[i] = i + 1;

		for (int i = 0; i < 39; i++) {
			int n = r.nextInt(39);
			int tmp = cc[i];
			cc[i] = cc[n];
			cc[n] = tmp;
		}

		for (int i = 0; i < 39; i++)
			System.out.print(cc[i] + " ");

		for (int i = 0; i < 5; i++) {
			numbers[i] = cc[i];
		}
		System.out.println("");
		print();
	 
	}
	@Override
	public void print() {
		for (int i = 0; i < 5; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}

	private void print_sort(boolean[] spots) {
		for (int i = 0; i < 40; i++) {
			if (spots[i])
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		Lottery539 lot = new Lottery539();
		lot.generate();
		
		Lottery539 lot2 = new Lottery539(1,2,9,4,5);
		System.out.println(lot2.validate());
		
		//介面使用，多型
		int k = 3;
		Game[] games = new Game[k];
		
		games[0] = new Lottery539();
		games[1] = new Lottery539(1,2,3,4,5);
		games[2] = new WillyGame();
		
		for(int i=0;i<games.length;i++){
			games[i].print();
		}
		 
	}

}
