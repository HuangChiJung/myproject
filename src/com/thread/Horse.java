package com.thread;

public class Horse extends Thread{
	String id;
	public  Horse(String id){
		this.id = id;
	}
	@Override
	public void run() {
		for(int i =1;i<5001;i++){
			System.out.println(id +" : "+i);
		}
	}
	 
}
