import java.util.Scanner;

public class fac {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the No. ---> ");
            int a = in.nextInt();
            System.out.println(fac(a));
        }
        static int fac(int a) {
            int f=1;
            for (int i=1;i<=a;i++) {
                f = f*i;
            }
            return f;
        }

}
