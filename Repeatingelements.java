package com.pack;

import java.util.Arrays;

public class Repeatingelements {
	public static void main(String[] args) {
	int[] arr = {2,13,4,5,5,3,3};
	int n =arr.length;
	boolean vis[] = new boolean[n];
	Arrays.fill(vis, false);
	for(int i=0;i<n;i++) {
		if(vis[i]==true) {
			continue;
		}
		int count =0;
		for(int j=0;j<n;j++)
		{
			if(arr[i]==arr[j]) {
				vis[j]=true;
				count++;
			}
		}
	
	if(count>1)
	System.out.println(arr[i] + " "+ count);
	}
}
}