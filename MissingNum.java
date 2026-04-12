package com.pack;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr = {1,4,5,7};
	int n = arr.length;
	int sum =0;
	for(int i=0;i<arr.length;i++) {
		sum += arr[i];
	}
	int exp = n * (n+1)/2 - sum ;
	System.out.println(exp);

	}

}
