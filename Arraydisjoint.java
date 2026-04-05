package com.pack;

public class Arraydisjoint {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {1, 6, 7, 8, 9};
        boolean isDisjoint = true; // assume arrays are disjoint initially

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    isDisjoint = false; // found a common element
                    break; // no need to check further
                }
            }
            if (!isDisjoint) {
                break;
            }
        }

        if (isDisjoint) {
            System.out.println("It is a disjoint arrays: true");
        } else {
            System.out.println("It is a disjoint arrays: false");
        }
    }
}
