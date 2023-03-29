package com.bridgelabz.DLS_Assinment_Program;

public class ArrayElementAtEvenIndex {
    public static void main(String []args){
        int[] arr={8,1,10,4,2,3,18,90,45};
        for (int i=0;i< arr.length;i=i+2){
            System.out.println(arr[i]);
        }
    }
}
