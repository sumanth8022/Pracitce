package com.pack;

public class Rightrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,5,6,6};
		int n = arr.length;
		int a = arr[n-1];
		for(int i=0;i<n-1;i++) {
			arr[i] = arr[i-1];
		}
		arr[0] = n;
		for(int num : arr) {
			System.out.println(num);
		}
	}

}
