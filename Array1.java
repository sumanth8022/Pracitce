package com.pack;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i] + " ");
//		}
		int[] arr = {11,5,6,3,2};
		int min = arr[0];
		for (int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			
		}
	
		System.out.println(min);
		

	}

}
