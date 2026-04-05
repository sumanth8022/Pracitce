package com.pack;

public class LargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int[]  arr = {11,4,5,6,8,96,881};
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]> max) {
				max = arr[i];
			}
		}
		System.out.println("the maximum number in the array is : " + max);
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("the minimum number in the array is :  " + min);

	}

}
