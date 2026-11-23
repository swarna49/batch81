package com.javaintro;

public class Cricketer {

	
		static int country_id; 
		static String country_name;
		static void method1() {
			Cricketer c1=new Cricketer();
			c1.method2();
			System.out.println("welcome");
		}
		void method2() {
			System.out.println("hi");
			
		}
		 void method3() {
			System.out.println("nice");
			method4();
		}
		 void method4() {
			 System.out.println("nice3");
		 }
		// //  //   //  //  //  //  //  instance variable - Declaration (non-static) 
		int jersey_number; 
		String cricketer_name; 
		public static void main(String[] args) { 
			System.out.println("Welcome to Indian Cricket Team !!"); 
			// Initialization 
			country_id = 91; 
			country_name = "india"; 
			// Representation of Static Data static Data can access directly or By using class name without creating Object 
			System.out.println("Country ID : " + country_id);// 0 --> 91 
			System.out.println("Country Name  :" + country_name);// null --> India If we want to access instance data, We must need to create Object. 
			// Object Creation : 
			// LHS : Cricketer is a class name & msd is the Object Reference variable. 
			//RHS : (Object) new is the java keyword to create Object by using Constructor calling. 
			//  Cricketer() is consider as Constructor calling. 
			Cricketer msd = new Cricketer(); 
			msd.jersey_number = 7; 
			msd.cricketer_name = "Mahendra Singh Dhoni"; 
			System.out.println("Jersey Number : " + msd.jersey_number); 
			System.out.println("Cricketer Name : " + msd.cricketer_name); 
			method1();
			Cricketer c2=new Cricketer();
			c2.method3();
		}

	

}
