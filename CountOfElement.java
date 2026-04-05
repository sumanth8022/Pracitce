package com.pack;

import java.util.Arrays;

public class CountOfElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,1,3,4,1,5};
		int n = arr.length;
		boolean[] vis = new boolean[n];
		Arrays.fill(vis, false);
		for(int i=0;i<n;i++) {
			if(vis[i]==true) {
				continue;
			}
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
					vis[j] = true;
				}
			}
			
			System.out.println(arr[i] + " " + count + " times "); 
		}
		}

}
