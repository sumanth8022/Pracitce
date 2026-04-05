package com.pack;

public class Minimumscalar {

	public static void main(String[] args) {
		int[] arr = {1,8,5,6,7};
		int[] arr1 = {6,7,8,9,1};
		int n =arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++)
				
			{
				if(arr[j]>arr[j+1])
					
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++)
				
			{
				if(arr1[j]<arr1[j+1])
					
				{
					int temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}
				
			}
			
		}
		int prod=0;
		for(int i=0;i<n;i++) {
			prod +=arr[i]*arr1[i];
		}
		System.out.println(prod);
		
		}

	}


