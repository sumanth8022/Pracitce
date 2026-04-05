package com.pack;

public class ReverseofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,2,3,4,5};
		int n = arr.length;
//		for(int i=n-1;i>=0;i--) {
//			System.out.print(arr[i] + " ");
//		}
		int start = 0;
		int end = n-1;
		while(start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +  " ");
		}
	}

}
