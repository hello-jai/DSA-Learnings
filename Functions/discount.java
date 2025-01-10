import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Original Price --- >");
        int a=in.nextInt();
        System.out.print("Enter The Discounted Price --- >");
        int b=in.nextInt();
        int p = ((a-b)*100)/a;
        System.out.println("The Discount is "+p+"%");
    }
}