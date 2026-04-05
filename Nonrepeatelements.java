package com.pack;

import java.util.Arrays;

public class Nonrepeatelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,5,6};
		int n = arr.length;
		boolean[] vis = new boolean[n];
		Arrays.fill(vis, false);
		for(int i=0;i<n;i++) {
		if(vis[i]==true) {
			continue;
			
		}
		int count = 0;
		for(int j=0;j<n;j++) {
			if(arr[i]==arr[j]) {
				vis[j]=true;
				count++;
			}
		}
		if(count>=1)
			System.out.println(arr[i] + " " + count);}

	}

}
