import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        System.out.println("Hello Guysss");
        Scanner no = new Scanner(System.in);
        System.out.print("Enter The No. ---> ");
        int a = no.nextInt();
        if (a % 2 == 0) {
            System.out.println("The No. Is Even");
        } else {
            System.out.println("The No is ODD");
        }

    }}