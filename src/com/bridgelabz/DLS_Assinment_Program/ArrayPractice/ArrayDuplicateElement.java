package com.bridgelabz.DLS_Assinment_Program.ArrayPractice;

public class ArrayDuplicateElement {
    public static void main(String []args){
        int arr[]={2,56,2,5,9,7,5,75,89,75};
        System.out.println("Duplicate element are: ");
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
