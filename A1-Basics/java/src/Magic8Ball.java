public class Magic8Ball {
    public static void main(String[] args){

        double randomResult = Math.random(); //Math.random() returns a decimal number of type double
        System.out.println(randomResult);
        System.out.println((int) (randomResult));
        System.out.println(randomResult * 10);
        System.out.println((int)(randomResult * 10));
        //int result = (int) (Math.random() * 10) ;
        /*             ^
              Casting the result of Math.random() to an integer
        */
    }
}
