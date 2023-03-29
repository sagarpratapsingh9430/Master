package com.bridgelabz.DLS;

public class SwitchCase {
    public static void main(String [] args){

        int d = 1;
        switch (d) {
            case 1:
                int z = 10;
                int y =40;
                int sum = z+y;
                System.out.println(sum);
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            case 4:
                System.out.println("case 4");
                break;
            default:
                System.out.println("default");
        }

        char ch = 'A';

        switch(ch){

            case 'A':
                System.out.println("case A");
                break;
            case 'B':
                System.out.println("case B");
                break;
            case 'C':
                System.out.println("case C");
                break;
            default:
                System.out.println("default");
        }

    }
}
