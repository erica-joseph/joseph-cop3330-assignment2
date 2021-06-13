package oop.assignment2.ex32;
import java.util.Scanner;

//add non-numeric entry partition
public class solution32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       player();

    }

    public static void player(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play Guess the Number!");
        System.out.println("Enter the difficulty level (1, 2, or 3): ");
        int diff = sc.nextInt();
        System.out.println("I have my number. What's your guess? ");
        if(diff == 1){
            easy();
        }
        else if (diff ==2){
            medium();
        }

        else if (diff == 3){
            hard();
        }
        else {
            System.out.println("Please select a valid difficulty");
        }
    }

    public static void easy() {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (10 * Math.random());
        int i, guess;
        for (i = 1; i < 10; i++) {
            guess = sc.nextInt();

            if (number == guess) {
                System.out.printf("You got it in %d guesses!", i);
                break;
            } else if (number > guess) {
                System.out.println("Too low.");
            } else if (number < guess) {
                System.out.println("Too high.");
            }
        }
    }

    public static void medium() {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int i, guess;
        for (i = 1; i < 10; i++) {
            guess = sc.nextInt();

            if (number == guess) {
                System.out.printf("You got it in %d guesses!", i);
                break;
            } else if (number > guess) {
                System.out.println("Too low.");
            } else if (number < guess) {
                System.out.println("Too high.");
            }
        }
    }

    public static void hard() {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int i, guess;
        for (i = 1; i < 10; i++) {
            guess = sc.nextInt();

            if (number == guess) {
                System.out.printf("You got it in %d guesses!", i);
                break;
            } else if (number > guess) {
                System.out.println("Too low.");
            } else if (number < guess) {
                System.out.println("Too high.");
            }
        }
    }
}
