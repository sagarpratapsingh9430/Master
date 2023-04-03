package com.bridgelabz.DLS_Assinment_Program.Day4.UC1;

public class SnakeLadder {
    static int position=0;
    static void Start(){
        System.out.println("Game start: ");
    }

    public static void main(String[] args) {


      Start();
       String playerName="Amit";
       int rollDice=(int) (Math.random()*10%6+1);
        System.out.println(rollDice);


    }
}
