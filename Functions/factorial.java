import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The No. ----- > ");
        int n=input.nextInt();
        int fac=1;
        for (int i=1; i <= n; i++) {
            fac*=i;
        }
        System.out.println("The Factorial Of "+n+" is "+fac);
    }
}
