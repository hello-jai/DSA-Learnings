import java.util.ArrayList;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<Integer>(5);
        String choice = "Y";
        while (choice.equals("Y")){
            System.out.print("Enter Element : ");
            int a = in.nextInt();
            list.add(a);
            System.out.print("Want to Add More ? (Y/N) --> ");
            choice = in.next();
        }
        System.out.println("Final List --> "+list);
        System.out.print("Want to Reverse ? --> ");
        String c = in.next();
        if (c.equals("Y")){
            System.out.println("Reversed List --> " + list.reversed());

        }

    }
}
