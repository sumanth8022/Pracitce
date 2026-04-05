package com.pack;
import java.util.*;
public class Postivie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0) {
				System.out.println("negative number" + n);
		}
		else {
			System.out.println("positive number " + n);
		}
		if(n%2==0) {
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}

	}

}
