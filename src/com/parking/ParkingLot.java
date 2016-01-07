package com.parking;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ParkingLot {
	int rate =30;
	SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
	Map<String, Car> cars = new HashMap<>();
	public int process(String id ,String time){
		int mins =0;
		if(cars.containsKey(id)){
			Car c = cars.remove(id);
			try {
				Date leave = sdf.parse(time);
				long ms = leave.getTime()-c.enter.getTime();
				mins = (int)(ms/(1000*60));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else
		{
			cars.put(id, new Car(id,time));
			
		}
		
		return mins;
	}
	
	public void add(Car c){
		cars.put(c.id, c);
	}
	
	public int remove(Car c){
		int fee =0;
		if(cars.containsKey(c.id)){
			//Car car = cars.remove(c);
			//process(c.id, c.enter);
			//int mins = (int)(c.enter.getTime()-car.enter.getTime()/(1000*60)); 
			//fee = (int)(rate*Math.ceil(mins/60f));
		}
		return fee;
	}
	
	public static void main(String[] args) {
		ParkingLot lot = new ParkingLot();
		try {
			FileReader fr = new FileReader("parking-data.txt");
			BufferedReader in = new BufferedReader(fr);
			
			String line = in.readLine();
			while(line!=null){
				System.out.println(line);
				String[] s = line.split(",");
				
				int mins = lot.process(s[1], s[0]);
				if (mins>0){
					int fee = (int)(lot.rate*Math.ceil(mins/60f));
					System.out.println(fee);
				}
				line = in.readLine();
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//cheap();
			
	}

	private static void cheap() {
		//ng();
		//ParkingLot lot = new ParkingLot();
		Map<String, String> lot = new HashMap<>();
		SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
		int rate =30;
		try {
			FileReader fr = new FileReader("parking-data.txt");
			BufferedReader in = new BufferedReader(fr);
			
			String line = in.readLine();
			while(line!=null){
				System.out.println(line);
				String[] s = line.split(",");
				System.out.println(s[0]);
				System.out.println(s[1]);
				
				String t = s[0];
			    String id = s[1];
			    
	 
				String enter = lot.remove(id);
				if(enter==null){
					lot.put(id, t);
				}else{
					try {
						Date enterTime = sdf.parse(enter);
						Date leaveTime = sdf.parse(t);
						
						long ms = leaveTime.getTime() - enterTime.getTime();
						int mins = (int)(ms/(1000*60));
						int fee = (int)(rate*(Math.ceil(mins/60f)));
						
						System.out.println(fee);
						
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
				//Calendar now = Calendar.getInstance();
				//System.out.println(now);
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
		
		//Car c1 = new Car(id,time);
	}
}
//有一停車場，收費1小時30元，需記錄車牌、入場時間、出場時間，並算出費用。
//
//0830,8877-QQ
//0910,1234-AB
//1040,2266-XY
//1130,8877-QQ
//1400,1234-AB