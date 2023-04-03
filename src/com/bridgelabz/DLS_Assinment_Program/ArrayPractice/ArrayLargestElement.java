package com.bridgelabz.DLS_Assinment_Program.ArrayPractice;

public class ArrayLargestElement {
    public static void main(String []args) {
        int[] arr = {5, 7, 9, 2, 40};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        System.out.println("Largest element of an array: " + arr[arr.length-1]);

    }
}
