import java.util.Scanner;

public class Exer18 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Academic Eligibility Checker\n");

        System.out.print("Grade: ");
        double g = scanner.nextDouble();

        System.out.print("Attendance Percentage: ");
        double a = scanner.nextDouble();

        boolean e = g >= 85 && a >= 80;

        System.out.println("\nEligible: " + e + "\n");
        scanner.close();
    }
}
