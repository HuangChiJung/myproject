package com.tom;

 

public class Wizard  extends Player {

	@Override
	public void attack() {
		System.out.println("使出定身術，周圍無法動彈三回合");	
	}
	
	public static void main(String[] args) {
		Integer i = new Integer(100);
		
		int n = i;
		int n2 = i.intValue();
		
		Integer i2 = 100;
		
		
//		String s1 = new String("abc");
//		
//		String s2 = new String("abc");
		
		
		String s1 = "abcddccc";  //編譯器 雞婆  認為 S1 及 S2  是同一個常數, 就創建一份
		
		String s2 = "abc";
		
		
		System.out.println(s1.replace("c","K"));
		s1.charAt(1);
		try {
			System.out.println(s1.charAt(6));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s1.indexOf("b");
		
		s1.lastIndexOf("x");
		
		System.out.println(s1.lastIndexOf("b"));
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		
		StringBuilder sb = new StringBuilder("abc");
		StringBuffer sb2 = new StringBuffer(); //多執行續
		
		sb.append("xyz");
		
		System.out.println(sb);
		
	}
}
