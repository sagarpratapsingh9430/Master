package com.bridgelabz.DRS;

public class ArraySumOfEven {
    public static void main(String [] args){
        int sum=0;
        int arr[]={2,6,4,3,9,10};
        for (int i=0;i< arr.length;i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
                sum = sum+arr[i];

            }
        }
        System.out.println("Sum of even numbers is: ");
        System.out.println(sum);

    }
}
