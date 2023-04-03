package com.bridgelabz.DLS_Assinment_Program.ArrayPractice;

public class ArraySecondLargestElement {
    public static void main(String []args){
        int temp=0;
        int arr[]={23,43,65,2,9,12,77,45,34};
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[arr.length-2]);
    }
}
