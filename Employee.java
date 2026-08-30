import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Employee Name: ");
        String emp1 = sc.nextLine();

        System.out.print("Enter Second Employee Name: ");
        String emp2 = sc.nextLine();

        if(emp1.equalsIgnoreCase(emp2))
            System.out.println("Both employees are in the same department.");
        else
            System.out.println("Employees are in different departments.");
    }
}