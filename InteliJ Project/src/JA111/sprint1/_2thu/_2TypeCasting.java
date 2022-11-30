package JA111.sprint1._2thu;

import java.sql.SQLOutput;

public class _2TypeCasting {
    public static void  main(String [] s){
//        int x=10;
//        byte b= (byte) x;

//        byte p=1;
//        byte q= (byte) (p+10);
        float f= (float) (10+2.0);

        // for only float you can add f with double to convert into float
        // result will follow this convention 'Max(int,typeA,typeB,typeC)'
        // by default result will of from above formula otherwise do explicit typecasting.
        System.out.println(f);

        char c='c';
//        byte b= (byte) c;
//        System.out.println(b);
        int i=c;
        System.out.println(i);

     byte x=1;
      byte y=2;
      byte z= (byte) (x+y);  // max(int,type of A,type of B)


    }


}

// By default any decimal value is double and non-decimal is int

// i.e we need to use f to declear float explicit typecasting.

// you can't and any int to int of type byte it will give you incompatable type error. you need to
// typecast explicitly.