package oop.assignment2.ex36;

import java.util.LinkedList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class solution36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        //while (!insert.equals(" ")) {

        while (i < 4) {
            System.out.print("Enter a number: ");
            int insert = sc.nextInt();
            numbers.add(insert);
            i++;
        }

        //The average is 400.0 (sum list)/size.list()
        //The minimum is 100 sort -> first
        //The maximum is 1000 sort -> last
        //The standard deviation is 353.55 ->
            int sum = 0;
            for(i = 0; i <= 3; i++) {
              sum += numbers.get(i);
             }




            int size = numbers.size();
            double average = sum/size;
            System.out.println(numbers);

            int sum2 = 0;
            for(i = 0; i <= 3; i++) {
                //double standardDev = Math.pow((i - average),2);
            sum2 += Math.pow((numbers.get(i) - average),2);
            }
            double standardDev = Math.sqrt((sum2/(size-1)));


            numbers.sort(Comparator.reverseOrder());
            System.out.println("after sorting: " + numbers);


            System.out.println("The average is " + average);
            System.out.println("The minimum is " + numbers.get(4));
            System.out.println("The maximum is " + numbers.get(0));
            System.out.printf("The standard deviation is %2f",standardDev);
    }

}
