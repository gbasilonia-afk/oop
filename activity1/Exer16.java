import java.util.Scanner;

public class Exer16 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pass or Fail Using Ternary\n");

        System.out.print("Grade: ");
        double g = scanner.nextDouble();

        String r = g >= 75 ? "PASSED" : "FAILED";

        System.out.println("\nResult: " + r + "\n");
        scanner.close();
    }
}