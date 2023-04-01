package week27;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1574. 删除最短的子数组使剩余数组有序
 * @date 2023/3/25 19:10:45
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().
                findLengthOfShortestSubarray(new int[]{1, 2, 3, 10, 4, 2,  83, 5}));
    }

    /**
     * 找到最短子数组长度
     *
     * @param arr 加勒比海盗
     * @return int
     *//*public int findLengthOfShortestSubarray(int[] arr) { 双指针
        int n = arr.length;
        int right = n - 1;
        while (right > 0 && arr[right - 1] <= arr[right])
            right--;
        if (right == 0) {
            return 0;
        }
        int ans = right;
        System.out.println(right);
        for (int left = 0;left == 0 || arr[left - 1] <= arr[left]; ++left) {
            while (right < n && arr[right] < arr[left])
                ++right;

            ans = Math.min(ans, right - left - 1);
        }
        return ans;
    }*/
    public int findLengthOfShortestSubarray(int[] arr) {// 双指针
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i + 1 < n && arr[i] <= arr[i + 1]) {
            ++i;
        }
        while (j - 1 >= 0 && arr[j - 1] <= arr[j]) {
            --j;
        }
        System.out.println(j);
        if (i >= j) {
            return 0;
        }
        System.out.println(i);
        int ans = Math.min(n - i - 1, j);
        for (int l = 0; l <= i; ++l) {
            int r = search(arr, arr[l], j);
            System.out.println(r);
            ans = Math.min(ans, r - l - 1);
        }
        return ans;
    }

    private int search(int[] arr, int x, int left) {
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (arr[mid] >= x) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
