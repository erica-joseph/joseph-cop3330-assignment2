package oop.assignment2.ex29;
import java.util.Scanner;

public class solution29 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        //years = 72/r
        System.out.println("What is the rate of return?");
        String RateoReturn = sc.next();

        if(!RateoReturn.equals("0")){
            if(isValid(RateoReturn)){
                int canuse=Integer.parseInt(RateoReturn);
                int years = 72/canuse;
                System.out.println("It will take 18 "+years+" to double your initial investment.");
            }
            else{
            System.out.println("Sorry. That's not a valid input.");
            }
        }
        else{
            System.out.println("Sorry. That's not a valid input.");
        }

    }

    public static boolean isValid(String str){
            char[] chars = str.toCharArray();

            for (char c : chars) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return true;
    }
}
