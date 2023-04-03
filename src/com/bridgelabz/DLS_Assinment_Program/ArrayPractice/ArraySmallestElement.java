package com.bridgelabz.DLS_Assinment_Program.ArrayPractice;

public class ArraySmallestElement {
    public static void main(String []args){
        int arr[]={7,4,8,2,50,1};
        int temp=0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Smallest element of an array: "+arr[0]);
    }
}
