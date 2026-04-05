package com.pack;

import java.util.Arrays;

public class ElementsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,1,2,3,44,5,5,6,7};
		int n = arr.length;
		
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {

		
		int count =1;
		while( i<n-1 && arr[i] == arr[i+1])
		{
			
			i++;
			count++;
			
		}
		System.out.println(arr[i] + " " + count);
		}
	}

}
