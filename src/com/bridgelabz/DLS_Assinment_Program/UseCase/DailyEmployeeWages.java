package com.bridgelabz.DLS_Assinment_Program.UseCase;

import java.util.Scanner;

public class DailyEmployeeWages {
    public static void main(String []args){


        int isEmployee=(int) (Math.random()*10%2);
        System.out.println(isEmployee);

//        System.out.println("Enter the total time: ");
//        Scanner obj=new Scanner(System.in);
//        int x= obj.nextInt();
        if (isEmployee==1){
            int time=8;

            int totalWages = time*20;
            System.out.println("Employee is present: ");
            System.out.println("Total wages for a day of a employee =" +totalWages);
        }
        else {
            System.out.println("Employee is absent: ");
            System.out.println("So total wages = "+0);
        }
    }
}
