package com.pack;

public class Countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1234455;
		int count = 0;
		while(n>0) {
			count++;
			n = n / 10;
		}
		System.out.println("The count of the digits is : " +count);

	}

}
