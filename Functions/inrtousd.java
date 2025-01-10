import java.util.Scanner;

public class inrtousd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("::::::::::INR to USD Currency Converter::::::::");
        System.out.print("Enter In Rupees ---> ₹");
        float inr = input.nextFloat();
        System.out.println("₹" + inr + " in USD is $" + inr*0.012);
    }
}
