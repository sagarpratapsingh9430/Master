package com.bridgelabz.Practice;

public class LargestSmallest {
    public static void main(String []args){

        int [] arr=new int[]{32,43,53,54,32,65,63,98,43,23};
        int largest=arr[0];
        int smallest=arr[0];

        for (int i=1;i< arr.length;i++){

            if (arr[i]>largest)
                largest=arr[i];

            else if (arr[i]<smallest)
                smallest=arr[i];
        }
        System.out.println("Largest = "+largest);
        System.out.println("Smallest ="+smallest);

    }
}
