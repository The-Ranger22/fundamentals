import java.util.ArrayList;
import java.util.Scanner;

public class TypesOfSelections {
    public static final int FLAG_NUMBER = 5; //This is a constant.
    public static void main(String[] args){

        /*
        (THE WHAT) Selection statements are used to compare the values of variables with one another and makes decisions
        based off of the result.(THE HOW) Relational and Conditional Operators are used to compare the values of the
        variables.
         */
        /*
        Relational/Equality Operators:
             == : equal
             != : not equal
              > : Greater than
              < : Less than
             >= : Greater than or equal to
             <= : Less than or equal to
        Conditional Operators:
             && : AND <-- Both conditions have to be true
             || : OR  <-- One condition has to be true
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int numToCompare = input.nextInt();
        input.nextLine();

        /*IF-ELSE*/

        //Basic
        if(numToCompare < FLAG_NUMBER){
            System.out.print("Number is less than FLAG_NUMBER");
        } else if (numToCompare == FLAG_NUMBER){
            System.out.println("Number is equal to FLAG_NUMBER");
        } else {
            System.out.println("Number is greater than FLAG_NUMBER");
        }

        //Complex
        int numOne;
        int numTwo;

        System.out.print("Enter the first number: ");
        numOne = input.nextInt();
        System.out.print("Enter the second number: ");
        numTwo = input.nextInt();
        input.nextLine();
        if(numOne == FLAG_NUMBER && numTwo == FLAG_NUMBER){
            System.out.println("numOne and numTwo are equal to FLAG_NUMBER");
        } else if(numOne == FLAG_NUMBER || numTwo == FLAG_NUMBER){
            if(numOne == FLAG_NUMBER){
                System.out.println("numOne is greater than FLAG_NUMBER");
            } else {
                System.out.println("numOne is greater than FLAG_NUMBER");
            }
        } else {
            System.out.println("Neither are equal to the FLAG_NUMBER");
        }


        /*SWITCH-CASE*/

        /*
        switch([variable]){
            case([condition]):{
                code...;
            }
        }
         */

        String string;
        System.out.print("Please input A, B or C");
        string = input.nextLine();

        switch(string.toUpperCase()){
            case "A":{
                System.out.println("Case: A");
                break;
            }
            case "B":{
                System.out.println("Case: B");
                break;
            }
            case "C":{
                System.out.println("Case: C");
                break;
            }
            default:{
                System.out.println("Default Reached");
            }
        }
        /*TERNARY*/

        int ternaryDecider;
        String evenOrOdd;

        System.out.print("Enter a number: ");
        ternaryDecider = input.nextInt();

        evenOrOdd = (ternaryDecider % 2 == 0) ? "the number you entered is even" : "the number you entered is odd";

        /*
        ([condition]) ? [result if condition is true] : [result if condition is false]
                      ^                               ^
                     'if'                           'else'
        */

//        if(ternaryDecider % 2 == 0){
//            evenOrOdd = "ternaryDecider is even";
//        } else {
//            evenOrOdd = "ternaryDecider is odd";
//        }

        System.out.println(evenOrOdd);


        /*
        Addendum: Modulo (%)
            Used to get the remainder (ex. 11 % 2 = 1)
         */


    }
}
