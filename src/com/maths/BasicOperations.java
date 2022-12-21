package com.maths;


public class BasicOperations {
	int x,y,a,b;
	private String name ="Encapsulation" ;
	public String Name="Inheritance";
	public void type() {
		if (x == y) {
			System.out.println("There is no information about this class's inhertance"+" "+ "This class is " +name);
		}
		else {
			System.out.println("The Class got Inherited"+" "+Name);
		}
	}
	public void newmethod() {
		
		if(a!=b) {
			System.out.println("Message here");
			
		}
	}
	
	public static void main(String[] args) {
		BasicOperations obj = new BasicOperations();
		obj.type();

	}

}
