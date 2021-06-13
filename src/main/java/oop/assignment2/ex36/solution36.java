package oop.assignment2.ex36;

import java.util.LinkedList;
import java.util.Scanner;

public class solution36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        //while (!insert.equals(" ")) {

        while (i < 5) {
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
            for(i = 0; i <= 4; i++) {
              sum += numbers.get(i);
             }

            int size = numbers.size();
            double average = sum/size;
            System.out.println(numbers);

            System.out.println(average);
    }

    public static void sort(){

    }
}
