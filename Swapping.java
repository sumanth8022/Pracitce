package com.pack;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int temp = a ;
		a = b;
		b = temp;
		System.out.println("Swapping using third variable ");
		System.out.println("a value is : "+ a);
		System.out.println("b value is : " + b);
		int x = 20;
		int y =45;
		 x = x +y;
		y = x - y;
		x = x - y;
		System.out.println("Swapping without third variable");
		System.out.println("x value is : " + x);
		System.out.println("y value is : "+y);

	}

}
