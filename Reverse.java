package com.pack;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123;
		int rev=0;
		int rem;
		while(n!=0) {
		rem = n % 10;
		rev = rev*10 + rem;
		n = n/10;
		}
System.out.println("the reverse of the Number is : " + rev);
	}

}
