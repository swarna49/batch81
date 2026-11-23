package com.javaintro;

public class Program1onstatic {
	
	static String college_name;
	static int batch_no;
	int roll_number;
	String name;
	long mobileno;
	static Program1onstatic p1=new Program1onstatic();

	static void method1() {
		p1.name="swarna";
		p1.mobileno=123456;
		p1.roll_number=91;
		college_name="vcube";
		batch_no=81;
		
	}
	void method2() {
		method1();
		System.out.println(name);
		System.out.println(mobileno);
		System.out.println(roll_number);
		System.out.println(college_name);
		System.out.println(batch_no);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        p1.method2();
	}
}
