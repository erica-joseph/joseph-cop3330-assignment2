package oop.assignment2.ex31;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class solution31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

        //int age = sc.nextInt();
        //int pulse = sc.nextInt();
        //intensity
        //rate
        System.out.printf("%-10s\n","Age: ");
        int age = sc.nextInt();
        System.out.printf("%-10s\n", "Resting Pulse: ");
        int rest = sc.nextInt();
        System.out.printf("%-10s %-10s %-10s\n", "Intensity", "|", "Rate");
        //System.out.printf("%-10s %-10s %-10s\n", "_____", "|", "______");

        bpmRate(age,rest);
        //System.out.printf("%-10s %-10s %-10s\n", "i love", "bananas", "bananas", "bananas");

    }

    public static void bpmRate(int age, int resting){

        int inten = 50;
        for(int i = 0; i <= 8; i++) {
            inten = inten + 5;
            //double w = (inten*.01) * g;
            double rate = (((220-age)-resting)*(inten*.01))+resting;
            System.out.printf("%-10s %-10s %-10s\n", inten+"%","|", (int)rate+" bpm");
        }
        //System.out.printf("%-10s %-10s %-10s\n","Resting Pulse: ", "|", "Age: ");


    }
}
