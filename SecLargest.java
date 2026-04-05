package com.pack;

public class SecLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {23,45,5,66,7,7};
int max = Integer.MIN_VALUE;
int sec = Integer.MIN_VALUE;
for(int i =0;i<arr.length;i++)
	if(arr[i]>max) {
		sec = max;
		max = arr[i];
	}
	else if (arr[i]>max && arr[i]>sec) {
		sec = arr[i];
	}
System.out.println(sec);
	}
	

}
