
package com.pack;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  =24;
		boolean isprime = true;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				isprime=false;
				break;
			}
		
		}
		if(isprime)
			System.out.println("  prime number");
		else
			System.out.println(" not prime number");

	}

}
