package com.bridgelabz.DLS;

public class ElseIf {
    public static void main(String [] args){


        int a = 34;
        int b = 39;

        if(a>34 && b>40){
            System.out.println("a > 34 and b > 40");
        }else if(a>34 && b<=40){
            System.out.println("a>34 and b<=40");
        } else if(a <=34 && b<=40){
            System.out.println("a <= 34 and b<=40");
        } else{
            System.out.println("this is else");
        }

        System.out.println("main ending");

    }
}
