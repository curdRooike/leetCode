package week16;

import util.SoutUtil;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1806. 还原排列的最少操作步数
 * @date 2023/1/9 00:18:29
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().reinitializePermutation(4));
    }
    public int reinitializePermutation(int n) {
        int[] perm = new int[n];
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            perm[i] = i;
            target[i] = i;
        }
        int step = 0;
        while (true) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                if ((i & 1) != 0) {
                    arr[i] = perm[n / 2 + (i - 1) / 2];
                } else {
                    arr[i] = perm[i / 2];
                }
            }
            perm = arr;
            step++;
            if (Arrays.equals(perm, target)) {
                break;
            }
        }
        return step;
    }
}
