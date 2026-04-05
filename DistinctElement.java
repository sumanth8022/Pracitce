package com.pack;
import java.util.*;
public class DistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,1,7,2,3,4,5,5};
		int n = arr.length;
		HashSet<Integer> hash = new HashSet<>();
		for(int i=0;i<n;i++) {
			hash.add(arr[i]);
		}
System.out.println(hash.size());
	}

}
