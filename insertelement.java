package com.pack;

public class insertelement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};
        int element = 4;
        int pos = 4; 
        int[] newArr = new int[arr.length + 1];


        for (int i = 0; i < pos-1; i++) {
            newArr[i] = arr[i];
        }

        
        newArr[pos - 1] = element;

//        
        for (int i = pos; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }

        
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}