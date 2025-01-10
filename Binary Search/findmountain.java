public class findmountain {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,9,5,4,2,0};
        int target = 5;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int [] arr, int target) {
        int peak=mountainpeak(arr);
        int firsttry= bsrch(arr,target,0 , peak);
        if (firsttry!=-1) {
            return firsttry;
        }
        else {
            firsttry=bsrch(arr,target,peak,arr.length);
            return firsttry;
        }
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

    static int bsrch (int[] arr, int target , int start , int end) {

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
