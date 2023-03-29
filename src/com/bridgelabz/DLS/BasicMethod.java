package com.bridgelabz.DLS;

public class BasicMethod {
    static void Product(){
        int a=3;
        int b=6;
        int z=a*b;
        System.out.println(z);
    }

    static int Divide(int x,int y){

        int div=x/y;
        return div;
    }
    public static void main(String []args){
        int x=10;
        int y=20;
        int sum=x+y;
        System.out.println(sum);

        Product();

        //Divide(12,4);// We can not call the method when return type is int. Because we can not able to print
        //                    the method like below.
        //System.out.println(Divide); We can not call directly

        System.out.println(Divide(12,4));

        // **********  OR  *************

        int div1= Divide(15,5);
        System.out.println(div1);

    }
}
