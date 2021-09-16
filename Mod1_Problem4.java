/**
 * complex number ==> z = a + (i*b)
 *
 *  z1 = a1 + i*b1
 *  z2 = a2 + i*b2
 *
 *  Addition: z1 + z2=(a1+a2) + i*(b1+b2)
 *
 *  Subtraction: z1 - z2=(a1-a2) - i*(b1-b2)
 *
 * Multiplication: z1*z2 = (a1*a2 – b1*b2) + i*(a1*b2 + b1*a2)
 *
 * Division: z1/z2 = (a1*a2 +b1*b2)/(a2^2 + b2^2) + i*(b1*a2 – a1*b2)/(a2^2 + b2^2)
 */



package com.company;
import java.util.Scanner;
public class Mod1_Problem4 {

    public static void main(String[] args) {

        Scanner myInt = new Scanner(System.in);
        System.out.println("Enter the real part of complex number z1: ");
        float a1 = myInt.nextFloat();
        System.out.println("Enter the imaginary part of complex number z1: ");
        float b1 = myInt.nextFloat();
        System.out.println("Enter the real part of complex number z2: ");
        float a2 = myInt.nextFloat();
        System.out.println("Enter the imaginary part of complex number z2: ");
        float b2 = myInt.nextFloat();

        String addition = addition(a1, a2, b1, b2);
        System.out.println(addition);

        String subtraction = subtraction(a1, a2, b1, b2);
        System.out.println(subtraction);

        String multiplication = multiplication(a1, a2, b1, b2);
        System.out.println(multiplication);

        String division = division(a1, a2, b1, b2);
        System.out.println(division);

    }

    public static String addition(float a1, float a2, float b1, float b2){
        float z1 = a1 + a2;
        float z2 = b1 + b2;
        return "z1 + z2 = " + z1 + " + " + z2 + "i";
    }

    public static String subtraction(float a1, float a2, float b1, float b2){
        float z1 = a1 - a2;
        float z2 = b1 - b2;
        return "z1 - z2 = " + z1 + " + " + z2 + "i";
    }

    public static String multiplication(float a1, float a2, float b1, float b2){
        float z1 = a1*a2 - b1*b2;
        float z2 = a1*b2 + b1*a2;
        return "z1 * z2 = " + z1 + " + " + z2 + "i";
    }

    public static String division(float a1, float a2, float b1, float b2){
        float z1 = (a1*a2 +b1*b2)/(a2*a2 + b2*b2);
        float z2 = (b1*a2 - a1*b2)/(a2*a2 + b2*b2);
        return "z1 / z2 = " + z1 + " + " + z2 + "i";
    }

}
