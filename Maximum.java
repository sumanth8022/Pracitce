package com.pack;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,6,7,82,56};
		int max = arr[0];
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
