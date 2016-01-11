package com.thread;

public class HorseRunnable implements Runnable{
	String id;
	public  HorseRunnable(String id){
		this.id = id;
	}
	@Override
	public void run() {
		for(int i=1;i<5000;i++){
		System.out.println(id +" : "+ i);
	}
 	
	}
}
