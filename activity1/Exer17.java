import java.util.Scanner;

public class Exer17 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Largest of Three Numbers\n");

        System.out.print("First Number: ");
        int a = scanner.nextInt();

        System.out.print("Second Number: ");
        int b = scanner.nextInt();

        System.out.print("Third Number: ");
        int c = scanner.nextInt();

        int largest = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);

        System.out.println("\nLargest number: " + largest + "\n");
        scanner.close();
    }
}