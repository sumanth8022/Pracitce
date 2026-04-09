package com.pack;
import java.util.*;
public class Commonelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = { 1,3,4,4,5,6,6,7};
		int[] ar  = { 1,4,5,6,7};
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<ar.length;j++) {
			if(arr[i] == ar[j]) {
				set.add(arr[i]);
			}
		}
		}
		System.out.println(set);
	}

}
