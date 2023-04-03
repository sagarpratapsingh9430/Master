package com.bridgelabz.WorkShop.FirstUseCase;
import java.lang.Math;
public class Line {
    Point ep1;
    Point ep2;

    float calculateLength(){
      //  return (float) Math.sqrt((ep1.x-ep2.x)*(ep1.x-ep2.x) + (ep1.y-ep2.y)*(ep1.y-ep2.y)) ;

        return (float) Math.sqrt(Math.pow(ep1.x-ep2.x,2) + Math.pow(ep1.y-ep2.y,2));
    }

}
