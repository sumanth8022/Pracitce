package com.pack;
import java.util.Arrays;

public class AscendingDescending {

    public static void main(String[] args) {

        int[] arr = {1,21,10,2,200,99,3,4,5};
        int n = arr.length;

        Arrays.sort(arr);

        for(int i = 0; i < n/2; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int j = n - 1; j >= n/2; j--) {
            System.out.print(arr[j] + " ");
        }

        System.out.println(); // move to new line
    }
}
