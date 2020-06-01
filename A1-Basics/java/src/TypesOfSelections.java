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

        if(numToCompare > FLAG_NUMBER){

        }

        /*SWITCH-CASE*/
        /*TERNARY*/
    }
}
