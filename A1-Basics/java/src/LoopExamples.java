import java.util.Scanner;

public class LoopExamples {
    public static void main(String[] args){
        guessingGame();
    }


    private static void guessingGame(){
        /*
        Ask the user for a number between 1 and 10, and depending on what they enter,
        display a message before asking again.
         */



        //Initialize variables
        Scanner input = new Scanner(System.in);
        final int ALLOWED_CHANCES = 2;
        int[] guesses = new int[ALLOWED_CHANCES]; /*Initializing an array
                        ^   ^


         */
        int chances = 0;


        //Think of a number
        int numberToGuess = (int) (Math.random() * 10 + 1);

        //Ask for input
        System.out.println("I'm thinking of a number between 1 and 10...");

        int guess = input.nextInt();

        //Check the number

        while(guess != numberToGuess && chances < ALLOWED_CHANCES){

            guesses[chances] = guess; //Storing guess in the array for use later
            /*

             */
            chances++;

            if(guess > numberToGuess){
                System.out.println("To high!");
            }
            else{
                System.out.println("To low!");
            }

            System.out.print("Guesses so far: ");

            for(int index = 0; index < chances; index++){
                System.out.print(guesses[index] + " ");
            }
            guess = input.nextInt();

        }
        if(guess == numberToGuess && chances < ALLOWED_CHANCES){
            System.out.println("Correct! Your guess: " + guess + " | My guess: " + numberToGuess);
        } else {
            System.out.println("Out of chances, you lose. Good day sir.");
        }
    }
}
