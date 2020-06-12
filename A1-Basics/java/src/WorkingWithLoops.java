public class WorkingWithLoops {
    private static final int FOR_LOOP_FLAG = 10;
    /*
    loop(condition){
        code        ->      Executes the code as long as the condition is met
    }
     */

    /*
    Types of Loops:
        -FOR loop <- Is short hand for a certain type of WHILE loop -> for(iteration; iteration limit; iteration increase){code}
        -WHILE loop <- Checks its condition BEFORE executing its code block -> while(condition){code}
        -DO-WHILE loop <- Checks its condition AFTER executing its code block -> do{code}while(condition)
     */
    public static void main(String[] args){

        boolean sentinel = true;
        //WHILE loop |-|
        while(sentinel){
            System.out.println("Hello! I'm from the while loop");
            sentinel = false;
        }

        //DO-WHILE |-| Executes first, checks second
        do{
            System.out.println("Hello, I've already run once since I'm in the DO-WHILE");
        }while(sentinel);





        /* The difference between WHILE and DO-WHILE */

        int count1 = 0, count2 = 0;

        while(count1 < 3){

            System.out.println("WHILE Run: " + count1);
            count1++;
        }

        do{
            System.out.println("DO-WHILE Run: " + count2);
            count2++;
        }while(count2 < 3);

        /* FOR Loops */

        for(int i = 0; i < FOR_LOOP_FLAG; i++){
            System.out.println("I'm in the for loop! I'm number " + i + "!");
        }

        int counter = 0;
        while(counter < FOR_LOOP_FLAG){
            System.out.println("I'm in the while loop! I'm number " + counter + "!");
            counter++;
        }

        /*
        These loops are functionally the same, with the FOR loop serving as an elegant short hand
        for the while loop configuration above.
         */

    }
}
