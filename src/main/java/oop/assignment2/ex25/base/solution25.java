package oop.assignment2.ex25.base;
import oop.assignment2.ex24.base.AnaDet;

import java.util.Scanner;
import java.lang.*;

public class solution25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your desired password: ");
        String password = sc.next();

        checkLen(password);

        System.out.println(password);


    }

    public static void checkLen(String str) {
        if (str.length() >= 8) {
            boolean isNum = checkNum(str);
            boolean isLet = checkLet(str);
            boolean isSpec = checkSpec(str);

            if(checkNum(str) && !checkLet(str) && !checkSpec(str)){
                System.out.println("is a very weak password.");
            }
            else if(!checkNum(str) && checkLet(str) && !checkSpec(str)){
                System.out.println("is a  weak password.");
            }
            else if(checkNum(str) && checkLet(str) && !checkSpec(str)){
                System.out.println("is a strong password.");
            }
            else if(checkNum(str) && checkLet(str) && checkSpec(str)){
                System.out.println("is a very strong password.");
            }
            else{
                System.out.println("Please submit a valid password.");
            }
        } else {
            System.out.println("For a password to be valid it must be greater than 8 characters.");
        }
    }

    public static boolean checkLet(String str) {
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkNum(String str) {
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

        public static boolean checkSpec(String str) {
            //check if string has special characters
            //check if true or false
            String specialCharacters = " !#$%&'()*+,-./:;<=>?@[]^_`{|}";
            for (int i = 0; i < specialCharacters.length(); i++) {

                //Checking if the input string contain any of the specified Characters
                if (!str.contains(Character.toString(specialCharacters.charAt(i)))) {
                    return false;
                }
            }
            return true;
        }

        //valid password is if stringLen >=8;

        //weak password  is if checkLet = true && checkNum = false && checkSpec = false;
        //very weak password is if checkLet = false && checkNum = true && checkSpec = false;
        //weak password is if checkLet = false && checkNum = false && checkSpec = true;
        //strong password if checkLet = true && checkNum = true && checkSpec = false;
        //very strong password if checkLet = true && checkNum = true && checkSpec = true;
        //invalid of all three false (i.e. no valid input)
    }


