package com.pack;

import java.util.Arrays;

public class ArrayisSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,6,8,1};
		boolean isSorted = true;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1]) {
			isSorted = false;
			break;
		}
		}
		if(isSorted){
			System.out.println("Array is Sorted");
		}
		else {
			System.out.println("Array is not Sorted");
		}
	}

}
