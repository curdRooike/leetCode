package week35;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1073. 负二进制数相加
 * @date 2023/5/18 10:58:18
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Test4().
                addNegabinary(new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 1})));
    }
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        if (n > m) return addNegabinary(arr2, arr1);
        int len = m + 2;
        int[] arr = new int[len];
        int idx = 0;
        for (int i = n - 1, j = m - 1; i >= 0; i--, j--) {
            arr[idx++] = arr1[i] + arr2[j];
        }
        for (int i = m - n - 1; i >= 0; i--) {
            arr[idx++] = arr2[i];
        }
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] >= 2) {
                arr[i] = arr[i] % 2;
                arr[i + 1]--;
            }
            if (arr[i] == -1) {
                arr[i] = 1;
                arr[i + 1]++;
            }
        }
        int k = len - 1;
        while (arr[k] == 0 && k > 0) k--;
        int[] ans = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            ans[k - i] = arr[i];
        }
        return ans;
    }
}
