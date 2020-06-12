import java.util.Scanner;

public class Selections {
    /*
    For this example, I have made use of named constants instead of simply giving the conditions for each statement
    'magic constants' which are hardcoded conditions that do not give any insight to as what they are.
    if(number > 5) seems innocuous enough, doesn't it? But in the midst of a large project, it can be easy to completely
    forget what 5 is supposed to represent.
    */
    private static final int COMPARISON_NUMBER = 5; //Defining a constant
    private static final String CASE_A = "a";
    private static final String CASE_B = "b";
    private static final String CASE_C = "c";
    public static void main(String[] args) {

        /*
        There are three types of selection statements, IF-ELSE, SWITCH-CASE, and Ternary statements. We'll look at Ternary
        statements later on.
         */
        Scanner input = new Scanner(System.in); //Used to take input from user
        /** IF-ELSE Statements */
        int aNumber; //Declaring aNumber as int

        System.out.print("Input a number:");
        aNumber = input.nextInt(); //Initializing aNumber with a given input
        input.nextLine();

        /*
        When writing an if-else statement, the narrowest restrictions should always come first.
         */

        if(aNumber > COMPARISON_NUMBER * 2){
            System.out.println(aNumber  + " is greater than 2 times " + COMPARISON_NUMBER);
        } else if(aNumber > COMPARISON_NUMBER){
            System.out.println(aNumber + " is greater than " + COMPARISON_NUMBER);
        } else {
            System.out.println(aNumber + " is not greater than " + COMPARISON_NUMBER);
        }

        System.out.println("|-----|-----|-----|-----|-----|-----|-----|");
        /** SWITCH-CASE Statements */
        String aWord; //Declaring aWord as a String

        System.out.print("Enter a letter: ");

        aWord = input.nextLine();

        switch (aWord){
            case(CASE_A):{
                System.out.println("Your input of " + aWord + " matches " + CASE_A + " [case(CASE_A)]");
                break;
            }
            case(CASE_B):{
                System.out.println("Your input of " + aWord + " matches " + CASE_B + " [case(CASE_B)]");
                break;
            }
            case(CASE_C):{
                System.out.println("Your input of " + aWord + " matches " + CASE_C + " [case(CASE_C)]");
                break;
            }
            default:{
                System.out.println("Your input of " + aWord + " did not match any case [default]");
            }
        }
        System.out.println("|-----|-----|-----|-----|-----|-----|-----|");

    }
}