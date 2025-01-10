package function;

import java.util.Scanner;

public class circumference {
    public static void main(String[] args) {
        System.out.print("Enter the Radius ----> ");
        Scanner in = new Scanner(System.in);
        float r = in.nextFloat();
        System.out.println(circum(r));
    }
    static float circum(Float r){
        double p = 2*3.14*r;
        return (float) p;
    }
}
