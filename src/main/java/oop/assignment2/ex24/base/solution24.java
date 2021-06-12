package oop.assignment2.ex24.base;
import java.util.Scanner;
import java.util.Arrays;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */

//want to have all of "scan from console" in the same class
//make scanner private static final
public class solution24 {
    //the reason you want static is so that there is only one of them (?)
    //is a security thing

    private static final Scanner sc = new Scanner(System.in);

    private static String word1; // not instance variables but class variables since we made them static
    private static String word2;
    private static boolean isAna;
    //only want things to be static if there is a good reason you only want one version of it


    //main function
    public static void main(String[] args){
        readUserInput();
        String temp = sortInput();
        String temp2 = sortInput2();

        AnaDet ad = new AnaDet();

        System.out.println(temp);
        System.out.println(temp2);

        boolean result = ad.isAna(temp, temp2); //run the function "anagram detection" on statements one and two

        String output = genOut(result);

        System.out.println(output); //a single output since string is stored in the "generate output" function
    }

    //when you start to see a lot of static things in your class, this is an indication that you need to make a new class
   //user input
    public static void readUserInput(){
    System.out.println("Enter word one: ");
    word1 = sc.next().toLowerCase();

    System.out.println("Enter word two: ");
    word2 = sc.next().toLowerCase();

    }
   //generate output function
    public static String genOut(boolean isAna){
        solution24.isAna = isAna;
        String output;
        if(isAna) {
        output = "is anagram."; //could reduce to "return" rather than equating output
        }
        else {
        output = "is not anagram.";
        }

        return output;
    }

    public static String sortInput(){

        char tempArray1[] = word1.toCharArray();
        Arrays.sort(tempArray1);

        return new String(tempArray1);
    }

    public static String sortInput2( ){


        char tempArray2[] = word2.toCharArray();
        Arrays.sort(tempArray2);

        return new String(tempArray2);
    }

}

