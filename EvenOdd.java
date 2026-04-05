package com.pack;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {11,3,5,6,8};
		int n = arr.length;
		int even=0;
		int odd=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println(even+" "+odd);
	}

}
