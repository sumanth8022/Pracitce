package com.pack;

public class SecondSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {112,34,55,66,99};
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		int sec = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=min && arr[i]<sec) {
				sec = arr[i];
			}
		}
		System.out.println(sec);
	}

}
