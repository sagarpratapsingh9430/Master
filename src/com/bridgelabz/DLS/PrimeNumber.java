package com.bridgelabz.DLS;

public class PrimeNumber {
    public static void main(String []args){
        int arr[]={1,7,10,9};
        int temp=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%1==0&&arr[i]%arr[i]==0){
               temp=arr[i];
            }

        }
        for (int i=0;i< arr.length;i++){
            System.out.println(temp);
        }
    }
}
