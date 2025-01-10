import java.util.Scanner;

public class Binaryscr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Target Element --> ");
        int target = in.nextInt();
        int arr[] = {1,2,4,5,6,7,8,9,10,11,12,14,15,16,18,20};
        int ans = bsrch(arr,target);
        System.out.println("The Index is " + ans);
    }


    static int bsrch (int[] arr, int target) {
        int start=0;
        int end = arr.length - 1 ;

        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
