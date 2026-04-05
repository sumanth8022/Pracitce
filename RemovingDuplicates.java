package com.pack;
import java.util.*;
public class RemovingDuplicates {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,8,9,5,5,6,7,1,9};
		int n = arr.length;
		HashSet<Integer> hash = new HashSet<>();
		for(int i=0;i<n;i++) {
			hash.add(arr[i]);
		}
		System.out.println(hash);
		
	}

}
