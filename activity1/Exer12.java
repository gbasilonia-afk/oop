import java.util.Scanner;

public class Exer12 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shopping Bill with VAT\n");

        System.out.print("Product Price: ");
        double pr = scanner.nextDouble();

        System.out.print("Quantity: ");
        int qt = scanner.nextInt();

        double st = pr * qt;
        double vat = st * 0.12;
        double total = st + vat;

        System.out.println("\nSubtotal: PHP " + st + "; \nVAT: PHP " + vat + "; \nTotal: PHP " + total + ";\n");
        scanner.close();
    }
}