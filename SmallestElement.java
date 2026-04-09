package com.pack;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,4,5,67,2,9};
		int n = arr.length;
		int min = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("The smallest element in the array is : " + min);

	}

}
