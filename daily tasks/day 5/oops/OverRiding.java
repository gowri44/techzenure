package com.Techzenure.java.oops;

class A1{
	int a=10,b=20;
	void display(); {
		System.out.println("class a has ---"+ a + "|" +b);
	}
}
	class B1 extends  A1{
		int a=11,b=21;
		void display(); {
			System.out.println("class a has ---"+ a + " | " + b + " | " + a + " | " + b);
}
	}
	
public class OverRiding {

	public static void main(String[] args) {
		 B1 obj = new B1(); 
			 obj.display();
		 
	}

	}



