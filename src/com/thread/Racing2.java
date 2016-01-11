package com.thread;

public class Racing2 {
	public static void main(String[] args){
//		Horse h1 = new Horse("Horse1");
//		HorseRunnable h2 = new HorseRunnable("Horse2");
//		h1.start();
//		Thread thr = new Thread(h2);
//		thr.start();
		
		new Thread(){
			public void run(){
				for(int i =1;i<5001;i++){
					System.out.println(getName() +" : "+i);
				}
			}
		}.start();
	
		
 
		
		Thread thr = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i =1;i<5001;i++){
					System.out.println("H2:"+i);
				}
			}
		});
		thr.start();
		
		//Lambda
		Runnable hr2 = () -> {
			for(int i =1;i<5001;i++){
				System.out.println("H2:"+i);
			}
		
		};
		
		Thread hrr = new Thread(hr2);
		hrr.start();
	}
	
	
}
