package com.javaintro;

public class Method2 {
// to not call in main method

	/* static void method1() {
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
	static {
		method1();
		method2();
		Method2 m1=new Method2();
		m1.method3();
		m1.method4();
	}*/
	static void method1() {
		System.out.println("method1 is execute");
		method2();
		Method2 m2 = new Method2();
		m2.method3();
	}
	static  void method2() {
		System.out.println("method2 is execute");
	}
	void method3() {
		System.out.println("method3 is execute");
		method4();
		
	}
	void method4() {
		System.out.println("method4 is execute");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        method1();
	}

}
