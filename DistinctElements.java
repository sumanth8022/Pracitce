package com.pack;

import java.util.Arrays;

public class DistinctElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,3,5,6,7,1,2};
		int n =arr.length;
		int count =0;
		boolean[] vis = new boolean[n];
		Arrays.fill(vis, false);
		for (int i=0;i<n;i++)
		{
			if(vis[i]==true) {
				continue;
			}
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					vis[j]=true;
				}
			}
			count++;
		}
		System.out.println(count);
	}

}
