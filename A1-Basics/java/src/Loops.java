public class Loops {
    private static final int FOR_LOOP_FLAG = 10;
    /*
    Loops are used to execute code repeatedly while a condition is being met.
     */
    /*
    There are 3 types of loops: WHILE, DO-WHILE, and FOR.
    |---|
    WHILE loops execute AFTER the condition is evaluated. -> while(condition){}

    DO-WHILE loops execute BEFORE the condition is evaluated. -> do{code}while(condition)
        -The contained code block will ALWAYS execute at least once.
    FOR loops execute for a KNOWN amount of repetitions. -> for(initial iteration value (i); condition
    |---|

     */
    public static void main(String[] args){

    }

    public static void whileLoopExample(){
        boolean sentinel = true;

        while(sentinel){
            System.out.println("The body of the while loop executes AFTER the condition is evaluated");
            sentinel = false;
        }}
    public static void doWhileLoopExample(){
        boolean sentinel = false;

        do {
            System.out.println("The body of the do-while loop executes BEFORE the condition is evaluated");
            sentinel = (!sentinel) ? true : false;
        } while (sentinel);
    }
    public static void forLoopExample(){
        for (int i = 0; i < FOR_LOOP_FLAG; i++){
            System.out.println("Loop iteration: " + i);
        }
    }
}
