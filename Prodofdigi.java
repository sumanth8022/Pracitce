package com.pack;

public class Prodofdigi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123;
		int prod = 1;
		while(n>0) {
			int rem = n % 10;
			prod = prod * rem;
			n= n /10;
		}
		System.out.println("The product of the digi : " + prod);

	}

}
