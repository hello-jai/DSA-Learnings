import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(":::::::::::::Simple Interest Calculator ::::::::::::");
        System.out.print("Enter The Principle Amount ---> ");
        int p = input.nextInt();
        System.out.print("Enter The Rate ---> ");
        int r = input.nextInt();
        System.out.print("Enter The Time  ---> ");
        int t = input.nextInt();
        int I = (p*r*t)/100;
        System.out.println("The Final Amount is " + I);
    }
}
