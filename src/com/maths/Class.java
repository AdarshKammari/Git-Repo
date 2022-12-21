package com.maths;

import java.util.*;


public class Class {
	int type, quantity;
	String itemName;
	double price;
	double rtax=0.155;
	double mtax=0.205;
	Scanner input =new Scanner(System.in);
	public void itemDetails() {
		
		System.out.println("Please Enter the Item Name:");
		String itemName =input.nextLine();
		System.out.println("Please enter the price of the Item:");
		double price= input.nextDouble();
		System.out.println("Please enter the quantity:");
		int quantity=input.nextInt();
		System.out.println("Please select the type of the item"+'\n'+"1-Raw"+'\n'+"2-Manufactured");
		int type=input.nextInt();
		if (type==1) {
			double rawTax = price*rtax;
			System.out.println("The Raw tax on the item: " + rawTax +"rupees");
			double totalPrice = price +rawTax;
			System.out.println("The Total Price of the Item="+totalPrice);
			
		}
		else if(type==2) {
			double mfdTax = price*mtax;
			System.out.println("The Manufacturing tax on the item " +itemName+"=" + mfdTax +"rupees");
			double totalPrice = price+mfdTax;
			System.out.println("The Total Price of the Item="+totalPrice);
		}
		else {
			System.out.println("Please Enter a valid keyword");
		
		}
	
		
	}
	
	public void action() {
		System.out.println("Do you want to enter details of any other item (y/n):");
		System.out.println("Press 'y' to continue "+'\n'+"press any key to quit");
		char choice = input.next().charAt(0);
		
	}
	


	public static void main(String[] args) {
		char choice = 0;
		
		do{
			Class item = new Class();
			item.itemDetails();
			
			item.action();
			
			
		}while(choice!='y');
	}

}
