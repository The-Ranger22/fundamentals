public class Loops {
    public static void main(String[] args){

        boolean sentinel = true;
        while(sentinel){
            System.out.println("The body of the while loop executes AFTER the condition is evaluated");
            sentinel = false;
        }
        do {
            System.out.println("The body of the do-while loop executes BEFORE the condition is evaluated");
        } while (sentinel);


    }
}
