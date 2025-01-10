import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList (5);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st value");
        list.addFirst(in.nextInt());
        System.out.println("Enter 2nd value");
        list.addFirst(in.nextInt());
        System.out.println(list);

    }
}
