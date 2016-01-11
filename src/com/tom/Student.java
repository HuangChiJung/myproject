package com.tom;

public abstract class Student {

	private int math;
	private int chinese;
	private int english;
	static int PASS = 60;

	public Student(int math, int chinese, int english) {
		this.math = math;
		this.chinese = chinese;
		this.english = english;
	}

	public Student() {
	}

	public Student(int english) {	 
		this(0, 0, english);
	}

	int getAverage() {
		int avg = (math + chinese + english) / 3;
		return avg;

	}
	public int getEnglish(){
		return english;
	}
	public int getMath(){
		return math;
	}
	public int getChinese(){
		return chinese;
	}
	public abstract void print();
	
	/*
	 * System.out.print(math + "\t" + chinese + "\t" + english + "\t" + getAverage());

		if (getAverage() < PASS)
			System.out.println("*");
		else
			System.out.println();
	 * 
	 * */

	public static void main(String[] args) {

//		Student stu = new Student(60, 52, 67);
//
//		Student stu2 = new Student(33, 77, 66);
//
//		Student stu3 = new Student();
//
//		Student stu4 = new Student(50); // english

		// Student.PASS =65;

//		stu.print();
//		stu2.print();
//
//		System.out.println(Math.max(stu.getAverage(), stu2.getAverage()));
//
//		System.out.println();
//
//		GraduateStudent gstu = new GraduateStudent(55, 60, 70, 69);
//		gstu.print();

	}

}
