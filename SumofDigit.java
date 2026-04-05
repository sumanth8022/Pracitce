package com.pack;

public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 987;
		int sum =0;
		while(n!=0) {
			int rem = n %10;
			sum=sum+rem;
			n = n/10;
		}
		System.out.println("the sum of the number is : " + sum);

	}

}
