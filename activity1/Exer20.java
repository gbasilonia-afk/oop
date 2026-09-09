import java.util.Scanner;

public class Exer20 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Complete Store Purchase Calculator\n");

        System.out.print("Product Price: ");
        double price = scanner.nextDouble();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Discount Percentage: ");
        double dp = scanner.nextDouble();

        System.out.print("Amount Paid: ");
        double paid = scanner.nextDouble();

        double gross = price * quantity;
        double discount = gross * (dp / 100);
        double ad = gross - discount;
        double vat = ad * 0.12;
        double bill = ad + vat;
        double change = paid - bill;

        boolean sp = paid >= bill;
        String status = sp ? "SUFFICIENT PAYMENT" : "INSUFFICIENT PAYMENT";
        String label = sp ? "Change" : "Difference";

        System.out.println("\nGross=" + gross + "; \nDiscount=" + discount + "; \nAfter Discount=" + ad + "; \nVAT=" + vat + "; \nFinal Bill=" + bill + ";\n" + label + "=" + change + ";\n" + status + ";\n");
        scanner.close();
    }
}
/*double discount = gross * (discountPercentage / 100);
amountPaid >= finalBill
String paymentStatus = sufficientPayment ? "SUFFICIENT PAYMENT" : "INSUFFICIENT PAYMENT"; */