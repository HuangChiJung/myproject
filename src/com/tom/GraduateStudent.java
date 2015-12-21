package com.tom;

public class GraduateStudent extends Student implements Reporter{
	private int thesis;
	static int pass = 70;

	public GraduateStudent(int math, int chinese, int english, int thesis) {
		super(math, chinese, english);

		this.thesis = thesis;
	}
 
	public GraduateStudent(int english, int thesis) {
		super(english);
		this.thesis = thesis;
	}
 
	@Override
	public void print() {
		System.out.print(getMath() + "\t" + getChinese() + "\t" + getEnglish() + "\t" + getAverage()+((getAverage() < PASS)? "*":""));
		System.out.println("\t" + thesis + ((thesis<pass) ? "*" : ""));

	}

	public static void main(String arg) {
		Student stu = new Student();
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	//
	// public GraduateStudent(int math, int chinese, int english) {
	// super(math, chinese, english);
	// thesis = 0;
	// }
	//
	// public GraduateStudent(int math, int chinese, int english, int thesis) {
	// super(math, chinese, english);
	// this.thesis = thesis;
	// }
	//

}
