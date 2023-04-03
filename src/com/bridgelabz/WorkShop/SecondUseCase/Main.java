package com.bridgelabz.WorkShop.SecondUseCase;
import java.util.*;
public class Main {
    static void main(String []args){
        Line l1=new Line();
        l1.ep1=new Point();
        l1.ep1.x=1;
        l1.ep1.y=2;

        l1.ep2=new Point();
        l1.ep2.x=10;
        l1.ep2.y=20;


        float length1 = l1.calculateLength();
        System.out.println("Length1 = "+length1);

        String str1=String.valueOf(length1);

        Line l2=new Line();
        l2.ep1=new Point();
        l2.ep1.x=2;
        l2.ep1.y=4;

        l2.ep2=new Point();
        l2.ep2.x=20;
        l2.ep2.y=40;

        float length2 = l2.calculateLength();
        System.out.println("Length2 = "+length2);

        String str2=String.valueOf(length2);

        System.out.println(str1 + " .equals " + str2
                + ": " + str1.equals(str2));
        System.out.println("Both line are equal: ");

        //*************** OR *******************

        if (length1==length2){
            System.out.println("Both line are equal");
        }

    }
}
