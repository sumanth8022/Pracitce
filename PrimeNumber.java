package com.pack;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0){
			System.out.println("not a Prime number");
			break;
		}
			else
			{
				System.out.println("prime number");
			}

	}}

}
