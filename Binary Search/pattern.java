import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int num_row = sc.nextInt();
        System.out.println("enter num of columns");
        int num_column = sc.nextInt();
        for (int i = 0; i <= num_row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
