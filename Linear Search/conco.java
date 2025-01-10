public class conco {
    public static int[] main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] sum = {};
        for (int i = 0 ; i < arr.length ; i++) {
            sum[i] = arr[i-1] + arr[i];
        }
        return sum;
    }
} 