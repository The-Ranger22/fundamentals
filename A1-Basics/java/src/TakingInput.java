import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args){
        /*
        The Scanner class is designed to take input from the user, either directly or through the use of files.
         */
        Scanner input = new Scanner(System.in);
        /*
        [data type] [variable name] = [instantiate keyword] [constructor]
        [data type] [variable name] = [new] [constructor]
         */
        int num;

        System.out.print("Enter a number: ");
        num = input.nextInt(); //Allows input of an integer
        input.nextLine(); //Closes input.nextInt() <-- TODO: Revisit
        System.out.println(num);

        String string;

        System.out.print("Enter a string: ");
        string = input.nextLine();
        System.out.println(string);
    }
}
