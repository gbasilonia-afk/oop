import java.util.Scanner;

public class Exer14 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BMI Calculator\n");

        System.out.print("Weight in kilograms: ");
        double w = scanner.nextDouble();

        System.out.print("Height in meters: ");
        double h = scanner.nextDouble();

        double bmi = w / (h * h);

        System.out.println("\nBMI: " + bmi + "\n");
        scanner.close();
    }
}