package com.pack;

import java.util.HashMap;
import java.util.Map;

public class firstnonrepeatingelement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,1,3,5};
		int n =arr.length;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
			}
			else {
				map.put(arr[i],1);
			}
		}
		
		for( Map.Entry<Integer,Integer> entry: map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}

	}

}
