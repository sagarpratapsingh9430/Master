package com.bridgelabz.DLS_Assinment_Program.ArrayPractice;

public class ArrayElementAtOddIndex {
    public static void main(String []args){
        int arr[]={34,2,54,65,45,23,89};
        for (int i=1;i< arr.length;i=i+2){
           // System.out.println("Element at odd position are: ");
            System.out.print(arr[i]+" ");
        }
    }
}
