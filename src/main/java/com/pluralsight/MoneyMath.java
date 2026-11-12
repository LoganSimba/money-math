package com.pluralsight;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyMath {
    public static void main(String[] args) {

        float floatly = 0; //initialize float
        double doublely = 0; //initilaize a double
        BigDecimal bigDecimal = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_UP);//initialize big decimal

        //iterate through a loop and print the float, doubl and bigDeimal each time
        for (int i = 0; i < 10; i++) {
            floatly += .10;
            System.out.println("Float " + floatly);

            doublely += .10;
            System.out.println("Double " + doublely);

            bigDecimal = bigDecimal.add(new BigDecimal(".10"));
            System.out.println("big Decimal "+ bigDecimal);

        }

        for (int i = 0; i < 1000; i++) {//iterate 1000 times and increment
            floatly += .10;
            doublely += .10;
            bigDecimal = bigDecimal.add(new BigDecimal(".10"));


        }//print the result
        System.out.println("-------------");
        System.out.println("Float " + floatly);
        System.out.println("Double " + doublely);
        System.out.println("big Decimal "+ bigDecimal);

    }
}
