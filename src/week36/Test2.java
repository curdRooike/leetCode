package week36;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description LCP 33. 蓄水
 * @date 2023/5/21 09:16:47
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().storeWater(new int[]{1, 3}, new int[]{6, 8}));
    }
    public int storeWater(int[] bucket, int[] vat) {
        int maxk = Arrays.stream(vat).max().getAsInt();
        if (maxk == 0) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int k = 1; k <= maxk && k < res; k++) {
            int t = 0;
            for (int i = 0; i < bucket.length; i++) {
                t += Math.max(0, (vat[i] + k - 1) / k - bucket[i]);
            }
            res = Math.min(res, t + k);
        }
        return res;
    }
}
