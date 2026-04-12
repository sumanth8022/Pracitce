package com.pack;

import java.util.HashSet;
import java.util.Set;

public class missingnumset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,7,8};
		int n = 8;
		Set<Integer> set = new HashSet<>();
		for(int num : arr) {
			set.add(num);
		}
		for(int i=1;i<=n;i++) {
			if(!set.contains(i)) {
				System.out.println(i);
			}
		}
	}

}
