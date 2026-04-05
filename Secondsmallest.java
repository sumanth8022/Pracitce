package com.pack;

public class Secondsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,6,7,2,1};
		int min =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		int sec = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] !=min && arr[i]>min) {
				sec=arr[i];			}
		}
		System.out.println(sec);

	}

}
