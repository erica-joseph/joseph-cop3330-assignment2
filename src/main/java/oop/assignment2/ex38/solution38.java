package oop.assignment2.ex38;
import java.util.Scanner;

public class solution38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        char[] chars = ("" + input).toCharArray();
        System.out.println(chars);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        if(input%2 == 0){
            System.out.print("This is an even nubmer");
        }
        else{
            System.out.print("This is an odd number");
        }
    }
}
