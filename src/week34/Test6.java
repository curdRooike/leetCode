package week34;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1054. 距离相等的条形码
 * @date 2023/5/14 19:05:29
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new Test6().rearrangeBarcodes(new int[]{1,1,1,1,2,2,3,3})));
    }
    public int[] rearrangeBarcodes(int[] barcodes) {
        int n = barcodes.length;
        Integer[] t = new Integer[n];
        int mx = 0;
        for (int i = 0; i < n; ++i) {
            t[i] = barcodes[i];
            mx = Math.max(mx, barcodes[i]);
        }
        int[] cnt = new int[mx + 1];
        for (int x : barcodes) {
            ++cnt[x];
        }
        Arrays.sort(t, (a, b) -> cnt[a] == cnt[b] ? a - b : cnt[b] - cnt[a]);
        int[] res = new int[n];
        for (int i = 0, j = 0; i < 2; i++) {
            for (int k = i; k < n; k += 2) {
                res[k] = t[j++];
            }
        }
        return res;
    }
}
