package com.bridgelabz.DLS;

public class Arrays {
    public static void main(String [] args){

        // Array is non-primitive data type
        System.out.println("*********This is one Dimension Array*******");
        int[] arr=new int[10];
        arr[0]=6;
        arr[1]=3;
        arr[5]=16;
        arr[9]=98;
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("**********This is two Dimension array**********");
        int[][] arr2=new int[3][3];
        arr2[0][0]=12;
        arr2[0][2]=120;
        arr2[2][1]=121;


        for (int i=0;i< arr2.length;i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.println(arr2[i][j]);
            }
        }

        System.out.println("************This is two Dimension**************");

        int[][] arr3=new int[3][4];
        arr3[0][0]=12;
        arr3[0][2]=98;
        arr3[2][1]=11;
        arr3[2][3]=27;

        for (int i=0;i< arr3.length;i++) {
            for (int j = 0; j < arr3[i].length; j++) {  //(Note the second(j) condition
                                                         // if it is not same row and column)
                System.out.println(arr3[i][j]);
            }
        }

        System.out.println("************This is three dimension*****************");

        int[][][] arr4=new int[3][4][3];  // or int[][][] arr4=new int[3][4][5]
        for (int i=0;i<arr4.length;i++){
            for (int j=0;j<arr4[i].length;j++){
                for (int k=0;k<arr4[i][j].length;k++){

                    System.out.println(arr4[i][j][k]);
                }
            }

        }

        // Inline initialization of one-D array Ex->int[] arr5={2,4,3,8,5};
        //                                              5
        // Inline initialization of two-D array Ex->int[][] arr6={{3,6,7,8},{5,6,8,9},{0,23,1,7}};
        //                                             3,4
        // Inline initialization of three-D array Ex->int[][][] arr7={{{2,6,4},{6,2,9}},{{12,11,10},{2,9,8,7}}};
        //                                               2,3,2
    }
}
