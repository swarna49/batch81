package com.javaintro;

public class Garbagecollector {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("the finalize is startedd");
	}

	void Hello(){
		System.out.println("hi");
		new Garbagecollector();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garbagecollector c1=new Garbagecollector();
		Garbagecollector c2=new Garbagecollector();
		Garbagecollector c3=new Garbagecollector();
		//adress of an obj
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//null point gc
		c1=null;
 
		// re assiging 
		c2=c3;
		System.out.println(c3);
		System.out.println(c2);
		
		// method inside 
		new Garbagecollector().Hello();
	
		System.gc();
	}

}
