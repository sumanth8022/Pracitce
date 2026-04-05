package com.pack;

public class SmallAndMAx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {112,3,4,5,6,7,782,1};
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0;i <arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
			
			
		}
		System.out.println(min);
		System.out.println(max);

	}

}
