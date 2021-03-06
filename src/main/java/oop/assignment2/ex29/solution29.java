package oop.assignment2.ex29;
import oop.assignment2.ex27.CalDet;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class solution29 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        //years = 72/r
        System.out.println("What is the rate of return?");
        String RateoReturn = sc.next();
        CalDet calc = new CalDet();
        calculator(RateoReturn);

    }

    public static boolean isValid(String str){
            char[] chars = str.toCharArray();

            for (char c : chars) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return true;
    }

    public static boolean calculator(String RateoReturn){
        if(!RateoReturn.equals("0")){
            if(isValid(RateoReturn)){
                int canuse=Integer.parseInt(RateoReturn);
                int years = 72/canuse;
                System.out.println("It will take "+years+" years to double your initial investment.");
                return true;
            }
            else{
                System.out.println("Sorry. That's not a valid input.");
                return false;
            }
        }
        else{
            System.out.println("Sorry. That's not a valid input.");
            return false;
        }
    }
}
