package com.javaintro;
// to display all methods in main method
public class Methods {
	static void method1() {
		System.out.println("method1 is execute");
	}
	static  void method2() {
		System.out.println("method2 is execute");
	}
	void method3() {
		System.out.println("method3 is execute");
	}
	void method4() {
		System.out.println("method4 is execute");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m1=new Methods();
		m1.method3();
		m1.method4();
		method1();
		method2();

	}

}
