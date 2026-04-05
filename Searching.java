package com.pack;

public class Searching {

	public static void main(String[] args) {
		int [] arr = {1,4,7,9,10,11};
		int tag = 9;
		int n =arr.length;
		boolean found = false;
		for(int i=0;i<n;i++) {
			if(arr[i]==tag) {
				System.out.println("element is found at index Position : " + arr[i]);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("not found");
	}}
}
