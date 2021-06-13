package oop.assignment2.ex34;

//finish later

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.*;
import java.util.Scanner;


public class solution34 {

    //public static void removal() {
        //int[] arr = new int[]{1, 2, 3, 4, 5};
        //int[] arr_new = new int[arr.length - 1];
        //int j = 3;
        //for (int i = 0, k = 0; i < arr.length; i++) {
           // if (i != j) {
             //   arr_new[k] = arr[i];
                //k++;
            //}
        //}


        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);

            LinkedList<String> names= new LinkedList<String>();
            names.add("John Smith");
            names.add("Jackie Jackson");
            names.add("Chris Jones");
            names.add("Amanda Cullen");
            names.add("Jeremy Goodwin");
            System.out.println(names);

              String remName = sc.next();

              if (!remName.equals("Amanda Cullen")) {
                  names.remove(0);
                  System.out.println("There are " + " employees");
                  System.out.println(names);
              }
              else if (!remName.equals("Jackie Jackson")) {
                  names.remove(1);
                  System.out.println("There are " + " employees");
                  System.out.println(names);
              }
              else if (!remName.equals("Chris Jones")) {
                  names.remove(2);
                  System.out.println("There are " + " employees");
                  System.out.println(names);
              }
              else if (!remName.equals("Jeremy Goodwin")) {
                  names.remove(3);
                  System.out.println("There are " + " employees");
                  System.out.println(names);
              }
              else if (!remName.equals("John Smith")) {
                  names.remove(4);
                  System.out.println("There are " + " employees");
                  System.out.println(names);
              }


        }

    }



