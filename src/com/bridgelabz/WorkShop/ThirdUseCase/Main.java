package com.bridgelabz.WorkShop.ThirdUseCase;

public class Main {
    public static void main(String []args){
        Line l1 = new Line();
        l1.ep1=new Point();
        l1.ep1.x=10;
        l1.ep1.y=20;

        l1.ep2=new Point();
        l1.ep2.x=1;
        l1.ep2.y=2;

        float length1= l1.lengthCalculate();
        System.out.println(length1);

        String str1= String.valueOf(length1);

        Line l2 = new Line();
        l2.ep1=new Point();
        l2.ep1.x=100;
        l2.ep1.y=200;

        l2.ep2=new Point();
        l2.ep2.x=25;
        l2.ep2.y=50;

        float length2= l2.lengthCalculate();
        System.out.println(length2);


        String str2=String.valueOf(length2);



        System.out.println(str1 + ".compareTo" + str2 +": " + str1.compareTo(str2));

        if(str1==str2){
            System.out.println("Both line is equal: ");
        } else {
            System.out.println("Both line have different length");

        }
    }
}
