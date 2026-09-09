import java.util.Scanner;

public class Exer11 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee Salary Calculator\n");

        System.out.print("Hours Worked: ");
        double hr = scanner.nextDouble();

        System.out.print("Hourly Rate: ");
        double rt = scanner.nextDouble();
        double gs = hr * rt;

        System.out.println("\nGross Salary: PHP " + gs + "\n");
        scanner.close();
    }
}