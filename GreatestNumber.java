package com.pack;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =-10;
		int b = 21;
		int c = 9;
//		if(a>b) {
//			System.out.println("greatest number is : " + a);
//			
//		}
//		else {
//		System.out.println("greatest number is : " + b);
//
//		}
	if(a>b && a>c) { 
		System.out.println("greater number is  " + a);
	}
	else if(b>a && b> c) {
		System.out.println("greater number is " + b);
	}
	else {
		System.out.println(c);
	}
	}
}
