package com.pack;

public class Secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,24,66,76};
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest ) {
				secondlargest = largest;
				largest = arr[i];
			}
			else if(arr[i]>secondlargest && arr[i]!=largest) {
				secondlargest = arr[i];
			}
		}
System.out.println("The second Largest ELement in the arrays is : "+secondlargest);
	}

}
