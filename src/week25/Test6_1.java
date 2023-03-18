package week25;

import util.SoutUtil;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1588. 所有奇数长度子数组的和(前缀和)
 * @date 2023/3/16 15:56:44
 */
public class Test6_1 {
    public static void main(String[] args) {
        int []a = {1,4,2,5,3};
        System.out.println(new Test6_1().sumOddLengthSubarrays(a));
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int[] prefixSums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSums[i + 1] = prefixSums[i] + arr[i];
        }
        SoutUtil.ArrayOut(prefixSums);
       int sum = 0;
        for (int start = 0; start < n; start++) {
            for (int length = 1; start + length <= n; length += 2) {
                int end = start + length;
                System.out.print(end - start +"    :prefixSums[end]: "+prefixSums[end]+"\t");
                System.out.println("prefixSums[start]: "+prefixSums[start]);
                sum += prefixSums[end] - prefixSums[start];
            }

        }
        return sum;
    }
}
