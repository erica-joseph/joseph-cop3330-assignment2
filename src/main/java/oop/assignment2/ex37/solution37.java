package oop.assignment2.ex37;
import java.util.Random;
import java.util.Scanner;

public class solution37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("What's the minimum length? ");
        int full = sc.nextInt();
        System.out.print("How many special characters? ");
        int num = sc.nextInt();
        System.out.print("How many numbers? ");
        int spec = sc.nextInt();

        System.out.print("Your password is ");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < (full-(num+spec)); i++) {
            System.out.print(alphabet.charAt(r.nextInt(alphabet.length())));
        }

        String numeric = "1234567890";
        for (int i = 0; i < num; i++) {
            System.out.print(numeric.charAt(r.nextInt(numeric.length())));
        }

        String special = "<([{\\^-=$!|]})?*+.>#";
        for (int i = 0; i < spec; i++) {
            System.out.print(special.charAt(r.nextInt(special.length())));
        }
    }

}
