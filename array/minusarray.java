import java.util.ArrayList;
import java.util.Scanner;

public class minusarray {
    public static void main(String arg[]){
        ArrayList <Integer> list = new ArrayList<Integer>(5);
        Scanner in = new Scanner(System.in);
        String s = "Y";
        while (s.equals("Y")){
            System.out.print("Enter Element : ");
            int e = in.nextInt();
            list.add(e);
            System.out.print("Want to Add More ?? (Y/N) ----> ");
            s = in.next();
            if (s.equals("N")) {
                break;
            }

        }
        System.out.println("Final List : " + list);

    }
}
