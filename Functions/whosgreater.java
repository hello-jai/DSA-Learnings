import java.util.Scanner;

public class whosgreater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st No. ---> ");
        int a = input.nextInt();
        System.out.print("Enter 2nd No. ---> ");
        int b = input.nextInt();
        if (a>b){
            System.out.println("1st is greater");}
        else {
                System.out.println("2nd is greater");
            }
    }
}
