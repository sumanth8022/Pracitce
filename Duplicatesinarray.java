package com.pack;

import java.util.*;

public class Duplicatesinarray {

    public static void main(String[] args) {

        int[] arr = {1, 3, 1, 3, 4, 5, 5, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Step 2: Print duplicates
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}