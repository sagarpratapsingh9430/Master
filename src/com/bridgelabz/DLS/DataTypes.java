package com.bridgelabz.DLS;

public class DataTypes {
    // 2 types -> primitive and non-primitive data types
// primitive -> byte,short,int,long,float,double,char,boolean
// non-primitive -> class ,interface ,array, enum
// Note :- For non-primitives default value is null
// Non-primitives always store objects.


        public static void main(String[] args) {

            byte x = 127; // 0
            short s = 23; // 0
            short s1 = 32767;
            int i = 10; // 0
            long l = 12; // 0
            float f = 10.0f; // 0.0f
            double d = 23.65; // 0.0
            char c = 'V'; // '\u0000'
            boolean b = false; // false

            // byte -> short -> int -> long-> float -> double(Here type casting is not need)
            //char->

            System.out.println((int) c);

            System.out.println(x);
            System.out.println(s);
            System.out.println(i);
            System.out.println(l);
            System.out.println(f);
            System.out.println(d);
            System.out.println(c);
            System.out.println(b);
            System.out.println();
            System.out.println("**************************************");

            byte var1 = 127;

            float var2 = var1;

            // AutoBoxing ->
            // int to Integer
            //  byte , short , int , long , float , double , char , boolean
            // Integer , Byte , Short , Long , Float , Double , Character , Boolean

            int y = 10;
            Integer integer1 = y;
            System.out.println(var2);

            // There is no requirement of type casting when we are storing lower data type variable into higher data type variable.
            // Whenever we are trying to store a higher data type variable to a lower data type variable , typecasting is mandatory
            // If the value taken in higher data type variable falls in the range of lower data type variable, there will not be any data loss
            // If the value taken in higher data type variable does not fall in the range of lower data type variable, there will be data loss

            long a = -2147483649L;
            int v = (int) a;
            System.out.println("a =>" + a);  // -2147483648
            System.out.println("v => " + v); // -2147483648


            int a1 = -212;
            byte v1 = (byte) a1; //(Data loss that why we can not get correct output)

            System.out.println("a1 =>" + a1);  // -21
            System.out.println("v1 => " + v1); // -21


//        String str = "ABC435dsfvvdASDAS";
            // 1 bit = 0/1
            // 1 byte = 8 bits
            // byte	1 byte	Stores whole numbers from -128 to 127
            // short 2 bytes Stores whole numbers from -32,768 to 32,767
            // int 4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
            // long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            // float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
            // double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits
            // boolean 1 bit	Stores true or false values
            // char 2 bytes	Stores a single character/letter or ASCII values
//
//        String str1 = new String("ABC");

            char c1 = '@';
            char c2 = 'A';
            char c3 = 'a';
            int res1 = c1;
            System.out.println(c1);
            System.out.println(res1);
            int res2 = c2;
            System.out.println(c2);
            System.out.println(res2);
            int res3 = c3;
            System.out.println(c3);
            System.out.println(res3);

            int res4 = c1;
            System.out.println(res4);
            char c4 = (char) res4;
            System.out.println(c2);

            // character can be intercoverted with integer
            System.out.println("Type-casting");
            byte b1 = 23;
            int i1 = b1;
            System.out.println(b1);
            System.out.println(i1);

            int i2 = 134;
            byte b2 = (byte)i2;
            System.out.println(i2);
            System.out.println(b2);

            int i3 = 234;
            byte b3 = (byte)i3;
            System.out.println(i3);
            System.out.println(b3);

            int var6 = 23;

            HelloWorld obj1 = new HelloWorld(); // null

        }
}
