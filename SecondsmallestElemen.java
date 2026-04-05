package com.pack;

public class SecondsmallestElemen {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int [] arr = {2,3,4,45,56};
			int sm = Integer.MAX_VALUE;
			int sec = Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<sm ) {
					
					sec = sm;
					sm = arr[i];
				}
				else if(sec>arr[i]) {
					sec = arr[i];
				}
			}
			System.out.println(sec);
		
	}


}
