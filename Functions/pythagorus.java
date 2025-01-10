package function;

import java.util.Scanner;

public class pythagorus {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st No ----> ");
        int a = in.nextInt();
        System.out.print("Enter 2nd No ----> ");
        int b = in.nextInt();
        System.out.print("Enter 3rd No ----> ");
        int c = in.nextInt();
        System.out.println("Are Theses Pythagorus Triplets ? --> " + pytha(a,b,c));
    }
    static boolean pytha(int a,int b, int c) {
        if ( (a*a) + (b*b) == (c*c) || (c*c) + (b*b) == (a*a) || (a*a) + (c*c) == (b*b) ) {
            return true;
        }else return false;
    }
}
