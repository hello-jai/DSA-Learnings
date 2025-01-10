import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[][] arr = new int [3][2];
        Scanner in = new Scanner(System.in);
        for (int row =0 ; row < arr.length ; row ++){
            System.out.println("for row : "+ row);
            for (int col = 0 ; col < arr[row].length ; col++) {
                System.out.println("for row-"+row+" and col-"+col);
                arr[row][col]=in.nextInt();
                System.out.println(arr[row][col]+" ");
            }
        }
    }
}