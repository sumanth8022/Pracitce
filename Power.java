package com.pack;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base =2;
		int expo=2;
		int itr = 2;
		while(itr!=0) {
			base*=itr;
			itr--;
		}
		System.out.println(base);

	}

}
