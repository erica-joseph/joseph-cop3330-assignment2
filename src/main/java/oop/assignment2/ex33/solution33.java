package oop.assignment2.ex33;
import java.util.Scanner;

public class solution33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your question?");
        String answer = sc.next();
        response(answer);
    }

    public static void response(String answer){
        int number = 1 + (int) (4 * Math.random());
        int i;
        for (i = 1; i < 4; i++) {

            if (number == 1) {
                System.out.println("Yes.");
                break;
            } else if (number == 2) {
                System.out.println("No.");
                break;
            } else if (number == 3) {
                System.out.println("Maybe");
                break;
            } else if (number == 4) {
                System.out.println("Ask again later.");
                break;
            }
        }
    }
}
