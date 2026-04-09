package com.pack;
import java.util.*;
public class CountFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1,4,5,5,6};
		int n = arr.length;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
				
			}
			else {
				map.put(arr[i],1);
			}
			
			
		}
		System.out.println(map);

	}

}
