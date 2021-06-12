package oop.assignment2.ex26.base;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */


public class solution26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.println("");

        //int numMon = sc.nextInt();
        System.out.println("What is your balance?");
        double bal = sc.nextDouble();
        System.out.println("What is the APR on the card (as a percent)?");
        double dayRate = sc.nextDouble() * .01;
        System.out.println("What is the monthly payment you can make?");
        double monPay = sc.nextDouble();

        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //a=1 + b/p * (1 - (1 + i)^30)
        //b=1+i
        //n = -(1/30) * log(a) / log(b)

        double a = 1 + (bal/monPay)*(1-Math.pow((1+dayRate),30));
        double b = 1+dayRate;

        double c = bal/monPay;
        double d = 1-Math.pow((1+dayRate),30);
        double numMon = -(1/30)*(Math.log10(a)/Math.log10(b));
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);

    }
}
