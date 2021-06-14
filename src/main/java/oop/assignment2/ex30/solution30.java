package oop.assignment2.ex30;
import java.util.Scanner;

public class solution30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int plants = 1;
        for(int i = 1; i <= 12; i++){
            sumLoop(i);
            System.out.printf("%-10d\n");
        }

        }


    public static void sumLoop(int x){
        int k = 0;
        for(int i = 0; i <= 11; i++) {
            k = k + x;
            System.out.printf(k+" ");
    }
}
}
