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

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);

            LinkedList<String> names= new LinkedList<String>();

            names.add("John Smith");
            names.add("Jackie Jackson");
            names.add("Chris Jones");
            names.add("Amanda Cullen");
            names.add("Jeremy Goodwin");
            int length = names.size()-1;
            System.out.println("There are " +(length+1)+ " employees");
            System.out.println(names);

              String remName = sc.next();

                  names.remove();
                  System.out.println("There are " +(length)+ " employees");
                  System.out.println(names);


        }

    }



