import java.util.Scanner;

public class Exer15 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Weighted Final Grade\n");

        System.out.print("Quiz Grade: ");
        double q = scanner.nextDouble();

        System.out.print("Project Grade: ");
        double p = scanner.nextDouble();

        System.out.print("Exam Grade: ");
        double e = scanner.nextDouble();

        double grade = (q * 0.30) + (p * 0.30) + (e * 0.40);

        System.out.println("\nFinal Grade: " + grade + "\n");
        scanner.close();
    }
}