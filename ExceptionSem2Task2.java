public class ExceptionSem2Task2 {
   
    public static void main(String[] args) {

        int[] intArray = {10, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}