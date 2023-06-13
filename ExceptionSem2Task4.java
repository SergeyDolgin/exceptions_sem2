import java.util.Scanner;

public class ExceptionSem2Task4 {

    public static void main(String[] args) {

        int x = 0;
        while (x != 1) {

            System.out.println("Please, enter text:");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();

            try {
                if (str.equals("")) {
                    throw new Exception();
                }
                System.out.println(str);
                System.out.println("Okay");
                x = 1;
            } catch (Exception e) {
                {
                    System.out.println("Exception e: Empty strings is not allowed, please try again");
                }

            }
        }
	}	
}