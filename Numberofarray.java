package com.pack;

public class Numberofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,25,40,30};
	for(int i=0;i<arr.length;i++) {
while(arr[i]%2==0 || arr[i]%3==0) {
	if(arr[i]%2==0) {
		arr[i]=arr[i]/2;
	}
	else {
		arr[i] = arr[i]/3;
	}
			
		}
		
	}
//	boolean poss=true;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=arr[0]) {
			System.out.println("not equal");
			return;
//			poss=false;
//			break;
		}
	}
//	if(poss) {
		System.out.print("equal");
//	}
//	else {
//		System.out.println("not equal");
//	}
		

	}

}
