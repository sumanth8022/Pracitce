package com.pack;

public class printprimenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.print("The Prime Numbers are : ");
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				continue;
			}
			else {
				System.out.print( i + " ");
			}
		}

	}

}
