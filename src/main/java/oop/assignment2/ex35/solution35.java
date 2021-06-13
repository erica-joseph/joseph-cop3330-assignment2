package oop.assignment2.ex35;

import java.util.LinkedList;
import java.util.Scanner;

public class solution35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        LinkedList<String> names = new LinkedList<String>();
        //while (!insert.equals(" ")) {

        while (i < 5) {
            System.out.print("Enter a name: ");
            String insert = sc.next();
            names.add(insert);
            i++;
        }
        int number = 1 + (int) (4 * Math.random());
        System.out.println("The winner is... " + names.get(number));
    }
}
