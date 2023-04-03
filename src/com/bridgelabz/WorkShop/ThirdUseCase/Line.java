package com.bridgelabz.WorkShop.ThirdUseCase;

public class Line {
    Point ep1;
    Point ep2;
    float lengthCalculate(){
        return (float) Math.sqrt(Math.pow((ep1.x-ep2.x),2) + Math.pow((ep1.y-ep2.y),2));
    }
}
