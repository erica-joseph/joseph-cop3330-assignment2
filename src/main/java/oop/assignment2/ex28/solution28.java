package oop.assignment2.ex28;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class solution28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



        int k  = 0;

        for(int i = 1; i <= 5; i++) {
            System.out.print("Enter a number: ");
            int Userinput = sc.nextInt();
            k += Userinput;
        }
        System.out.println("The total is " + k);

    }



}
