//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 173, 11, 2346};
        System.out.println("Enter The Element You want to Search");
        int e = in.nextInt();
        int ans = linearsearch(nums, e);
        System.out.println("Element is at index'" + ans + "'");
    }

    static int linearsearch(int[] arr, int e) {
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int i = var2[var4];
            if (arr[i] == e) {
                return i;
            }
        }

        return -1;
    }
}
