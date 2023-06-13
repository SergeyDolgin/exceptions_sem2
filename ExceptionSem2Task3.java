public class ExceptionSem2Task3 {
    
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2, 3, 4};
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Pointer can't be linked to null!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Array is ouy of its bounds");
        } catch (Throwable ex) {
            System.out.println("Unexpetec error");
        }
    }

    public static void printSum(Integer a, Integer b) throws ArithmeticException {
        System.out.println(a + b);
    }
}
