package oop.assignment2.ex38;
import java.util.LinkedList;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class solution38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char[] chars = (input).toCharArray();

        LinkedList<String> evens = new LinkedList<String>();

       System.out.print("The even numbers are ");
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] % 2 == 0) {
                System.out.print(chars[i]+",");
            } else {

            }
        }
    }
}
