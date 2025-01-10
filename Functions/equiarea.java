import java.util.Scanner;

public class equiarea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The First Side : ");
        float s1=in.nextFloat();
        System.out.print("Enter The Second Side : ");
        float s2=in.nextFloat();
        System.out.print("Enter The Third Side : ");
        float s3=in.nextFloat();
        float s=(s1+s2+s3)/2;
        float area=(float)Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println(area);

    }
}
