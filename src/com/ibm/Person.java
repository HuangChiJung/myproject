package com.ibm;

import java.util.Scanner;

public class Person {
	String name;
	private float weight;
	float height;

	public Person(float weight, float height) {
		this.weight = weight;
		this.height = height;
	}

	public Person(String name)
	{
		this.name = name;
	}
	
	public Person(float weight){
	
	}
	
	public Person(){
	}
	
	public float bmi() {
		float bmi = weight / (height * height);
		bmi = (int) (bmi * 100) / 100.0f;
		return bmi;
	}
    
	public float bmi(float weight,float height){
		float bmi = weight / (height * height);
		bmi = (int) (bmi * 100) / 100.0f;
		return bmi;
	}
	public String sayHello(String str) {
		System.out.println(str);
		return str;
	}

	public String advice() {
		float bmi_local = bmi();
		String msg;

		if (bmi_local < 16) {
			msg = "eat more";
		} else {
			if (bmi_local > 25) {
				msg = "eat less";
			} else {
				msg = "normal!";
			}
		}

		if (bmi_local < 16) {
			msg = "eat more";
		} else if (bmi_local > 25) {
			msg = "eat less";
		} else {
			msg = "normal!";
		}

		if (bmi_local >= 16 && bmi_local <= 25) {
			msg = "normal";
		} else {
			if (bmi_local < 16) {
				msg = "eat more";
			} else {
				msg = "eat less";
			}

		}
		System.out.println(msg);
		return msg;
	}

	public static void main(String[] args) {
		Lottery539 lot = new Lottery539();

		int n = 5, m = 7;

		int max = (n > m) ? n : m;

		System.out.println("MAx " + max);
		System.out.println((n > m) ? n : m);

		System.out.println(n++); // 後置
		// System.out.println(n);
		// System.out.println(++n);
		// System.out.println(n);
		n++;
		n += 3;
		System.out.println(n >> 2);

		if (n > m) {
			System.out.println(n);
		} else {
			System.out.println(m);
		}

		Person p = new Person(98.5f, 1.77f);

		String str;
		str = p.sayHello("Hello");
		System.out.println(str);

		System.out.println(p.bmi());

		System.out.println(p.advice());

		Scanner scanner = new Scanner(System.in);
		float h, w;

		System.out.print("please in put your weight:");
		String line = scanner.nextLine();
		System.out.println(line);

		w = Float.parseFloat(line);
		System.out.print("please in put your height:");
		line = scanner.nextLine();
		System.out.println(line);
		h = Float.parseFloat(line);

		Person P2 = new Person(w, h);
		System.out.println(P2.bmi());

		System.out.print("please in put your weight:");
		w = scanner.nextFloat();
		System.out.print("please in put your height:");
		h = scanner.nextFloat();

		Person p3 = new Person(w, h);
		System.out.println(p3.bmi());

	}
}
