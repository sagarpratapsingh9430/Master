package com.bridgelabz.DLS_Assinment_Program;
import java.util.*;

public class ArrayFrequencyOfEachElement {

        public static void main(String[] args) {

            int[] array = { 2, 3, 5, 4, 3, 1, 3, 2, 1,2,4,5,55,60,55 };
            Arrays.sort(array);

            int i,j,frequency;
            System.out.println("These elements are repeated along with its frequency-");

            for(i=0; i<array.length; i++){
                frequency = 1;
                for(j=i+1; j<array.length; j++){
                    if(array[j] == array[i]){
                        frequency++;
                    } else {
                        break;
                    }
                }
                i=j-1;
                if(frequency > 1){

                    System.out.println(array[i] + " --> " + frequency);
                }
            }
        }


}
