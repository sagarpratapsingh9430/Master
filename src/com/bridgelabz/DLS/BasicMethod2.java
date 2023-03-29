package com.bridgelabz.DLS;

public class BasicMethod2 {
    static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    static int product(int num1, int num2) {
        int prod = num1 * num2;
        return prod;
    }

    static void product2() {
        int x = 12;
        int y = 34;
        int prod = x * y;
        System.out.println(prod);
    }

    static int calculate(int var1, int var2) {
        //var1 =30, var2=78
        int sum2 = sum(var1, var2);    //sum2=108
        int prod = product(sum2, 65);  // product(108,65)
        return prod;
    }


    // JVM calls the main method
    public static void main(String[] args) {

        // Method calling
        int sum3 = sum(20, 30);
        System.out.println(sum3);
        int res = sum3 + 457;
        System.out.println(res);

        int sum2 = sum(sum3, 78);
        System.out.println(sum2);

        product(46, 98); // method call with parameters without printing(because it's return type is int. It means
        //   we can not print directly// )
        product2();  // method call without parameters


        int result = calculate(30, 78);
        System.out.println(result);


    }
}
