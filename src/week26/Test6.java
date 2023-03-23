package week26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1630. 等差子数组
 * @date 2023/3/23 08:32:22
 */
public class Test6 {
    public static void main(String[] args) {
        int []a = {4,6,5,9,3,7};
        int []b = {0,0,2};
        int []c = {2,3,5};
        System.out.println(new Test6().checkArithmeticSubarrays(a, b, c));
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int n = l.length;
        List<Boolean> res = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int k = r[i];
            int j = l[i];
            int[] arr = Arrays.copyOfRange(nums,j,k + 1);
            Arrays.sort(arr);
            int d = arr[1] - arr[0];
            for (j = 1;j < arr.length; j++) {
                if (d != arr[j] - arr[j-1]) {
                    res.add(false);
                    break;
                }
            }
            if (j == arr.length) {
                res.add(true);
            }
        }
        return res;
    }
}
