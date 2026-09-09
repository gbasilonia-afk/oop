import java.util.Scanner;

public class Exer13 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Celsius to Fahrenheit Converter\n");

        System.out.print("Celsius Temperature: ");
        double c = scanner.nextDouble();

        double f = (c * 9 / 5) + 32;

        System.out.println("\nFahrenheit: " + f + "\n");
        scanner.close();
    }
}