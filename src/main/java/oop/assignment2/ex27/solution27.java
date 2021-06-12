package oop.assignment2.ex27;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class solution27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);

        System.out.println("What is your first name?");
        String firstname = sc.next();
        System.out.println("What is your last name?");
        String lastname = sc.next();
        System.out.println("Enter zipcode:");
        String zip = sc.next();
        System.out.println("Enter employee ID:");
        String Employee = sc.next();

        validateInput(firstname, lastname, zip, Employee);
    }

    public static boolean zipDigi(String str){
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    //first name
    public static boolean firstName(String str){
        if(str.length()>=2){
            return true;
        }
        else if(str.length() == 0){
            System.out.println("The first name must be filled in.");
            return false;
        }
        else{
            System.out.println("The first name must be at least 2 characters long.");
            return false;
        }
    }
    //last name
    public static boolean lastName(String str){
        if(str.length()>=2){
            return true;
        }
        else if(str.length() == 0){
            System.out.println("The last name must be filled in.");
            return false;
        }
        else{
            System.out.println("The last name must be at least 2 characters long.");
            return false;
        }
    }
    //zipcode
    public static boolean zipValid(String str){
        if(str.length()>=5){
            if(zipDigi(str)){
                return true;
            }
            else{
                System.out.println("The zipcode must be a 5 digit number.");
                return false;
            }

        }
        else{
            System.out.println("The zipcode must be a 5 digit number.");
            return false;
        }

    }
    //employee ID
    public static boolean EmpID(String str){
        Pattern pattern = Pattern.compile("[a-zA-Z][a-zA-Z]-[0-9][0-9][0-9][0-9]");

        Matcher matcher = pattern.matcher(str);
        boolean matchFound = matcher.find();
        if(matchFound) {
            return true;
        } else {
            System.out.println("The employee ID must be in the format of AA-1234.");
            return false;
        }
    }

    public static boolean validateInput(String str1, String str2, String str3, String str4){
        firstName(str1);
        lastName(str2);
        zipValid(str3);
        EmpID(str4);

        if(firstName(str1) && lastName(str2) && zipValid(str3) && EmpID(str4)){
            System.out.print("There were no errors found.");
            return true;
        }
        else{
            return false;
        }
    }
    }

