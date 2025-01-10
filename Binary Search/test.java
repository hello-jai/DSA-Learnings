import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element you want to search --> ");
        int target = in.nextInt();
        int arr [] = {1,2,3,4,6,8,13,20,24,45};
        int ans = seal(arr,target);
        System.out.println("The Index is ---->> "+ ans);
    }
    static int seal(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + (start-end))/2;
            if (target<arr[mid]){
                end=mid-1;
            }
            if (target>arr[mid]) {
                start=mid+1;
            } else {
                return mid;
            }
        }return start;
    }
}
