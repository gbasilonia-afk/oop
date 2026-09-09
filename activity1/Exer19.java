import java.util.Scanner;

public class Exer19 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitwise and Shift Operations\n");

        System.out.print("First Integer: ");
        int a = scanner.nextInt();

        System.out.print("Second Integer: ");
        int b = scanner.nextInt();

        System.out.println("\nAND=" + (a & b) + "; \nOR=" + (a | b) + "; \nXOR=" + (a ^ b) + "; \nNOT a=" + (~a) + "; \na<<1=" + (a << 1) + "; \na>>1=" + (a >> 1) + ";\n");
        scanner.close();
    }
}