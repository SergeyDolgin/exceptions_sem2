// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class ExceptionsSem2Task1 {

    public static void main(String[] args) {
        int count = 0;
		while (count != 1) {			
			System.out.println("Please, enter float number");
	        Scanner s = new Scanner(System.in);
    	    String number = s.nextLine();
			try {
				float d = Float.parseFloat(number);
				System.out.println(d);
				count = 1;
			} 
			catch (NumberFormatException e) {
				System.out.println("Text can't be float number");
			}
		}	
	}	
}