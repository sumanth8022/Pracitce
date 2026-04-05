package com.pack;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 120;
		int rep = n;
		int rem ;
		int rev = 0;
		while(n!=0) {
			rem = n %10;
			rev = rev*10 + rem;
			n = n /10;
			
		}
		if(rev == rep) {
System.out.println("it is a palindrome");
	}
	else
	{
		System.out.println("IT is not a palindrome");
	}
}
}
