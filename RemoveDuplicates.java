package com.pack;
import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,5,2,1,3,5,6,6};
		int n  = arr.length;
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i=0;i<n;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}

}
