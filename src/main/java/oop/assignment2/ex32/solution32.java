package oop.assignment2.ex32;
import java.util.Scanner;

//add non-numeric entry partition
public class solution32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play Guess the Number!");
        System.out.println("Enter the difficulty level (1, 2, or 3): ");
        int diff = sc.nextInt();
        System.out.println("I have my number. What's your guess? ");
        int guess = sc.nextInt();
        player(diff, guess);

    }

    public static void player(int diff, int guess){
        Scanner sc = new Scanner(System.in);
        if(diff == 1){
            easy(guess);
        }
        else if (diff ==2){
            medium(guess);
        }

        else if (diff == 3){
            hard(guess);
        }
        else {
            System.out.println("Please select a valid difficulty");
        }
    }

    public static void easy(int guess) {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (10 * Math.random());
        int i;
        for (i = 1; i < 100; i++) {
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

    public static void medium(int guess) {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int i;
        for (i = 1; i < 100; i++) {
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

    public static void hard(int guess) {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int i;
        for (i = 1; i < 100; i++) {
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
