package com.green.day13.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4,10};
        System.out.println(Arrays.toString(arr));

        printIntArr(arr); // [3, 2, 1, 6, 5, 4, 10]

    }

    public static void printIntArr(int[] arr){
        if(arr.length == 0) { return; }
        System.out.printf("[%d",arr[0]);
        for(int i=1; i<arr.length; i++){
            System.out.printf(", %d",arr[i]);
        }
        System.out.printf("]");

    }

}
