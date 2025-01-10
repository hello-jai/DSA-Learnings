package function;

import java.util.Scanner;

public class iseligible {
    public static void main(String[] args) {
        System.out.print("Enter Your Age -----> ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println(isage(age));
    }
    static boolean isage(int age) {
        return age >= 18;
    }
}
