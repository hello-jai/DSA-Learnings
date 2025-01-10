import java.util.Scanner;

public class ceiling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {1,2,4,5,6,8,9};
        System.out.print("Enter Target -- ");
        int target=in.nextInt();
        int ans = ceil(arr,target);
        System.out.println(ans);
    }

    static int ceil(int[] arr,int target) {
        int start = 0;
        int end = arr.length;

        while (start <= end){
            int mid= start + (end-start)/2;
            if (target < arr[mid]) {
                end=mid-1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }return start;
    }
}
