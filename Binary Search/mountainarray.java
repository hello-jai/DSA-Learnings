public class mountainarray {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,9,5,4,2,0};
        int ans=mountainpeak(arr);
        System.out.println(ans);
    }
    static int mountainpeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
