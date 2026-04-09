package com.pack;

public class LargestELements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,23,4,6,6,9};
		int n = arr.length;
		int max = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("The Largest ELement in the array is : " + max);

	}

}
