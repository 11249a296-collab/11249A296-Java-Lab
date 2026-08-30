import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter Age: ");
            String age = sc.nextLine();

            int a = Integer.parseInt(age);

            int result = 100 / (a - a);

            System.out.println(result);
        }

        catch(NumberFormatException e)
        {
            System.out.println("Invalid Age! Enter numbers only.");
        }

        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception: Division by Zero.");
        }

        System.out.println("Program Ended Successfully.");
    }
}