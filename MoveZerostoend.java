package com.pack;

public class MoveZerostoend {

    public static void main(String[] args) {

        int[] arr = {0,4,5,0,0,2,1};

        int index = 0;

        // move non-zero elements forward
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // fill remaining positions with 0
        while(index < arr.length) {
            arr[index] = 0;
            index++;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}