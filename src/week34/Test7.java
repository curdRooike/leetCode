package week34;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1072. 按列翻转得到最大值等行数
 * @date 2023/5/15 00:44:32
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().
                maxEqualRowsAfterFlips(new int[][]{{0, 1}, {1, 0}}));
    }
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        Map<String, Integer> hashMap = new HashMap<>();
        for (int[] ints : matrix) {
            char[] c = new char[n];
            Arrays.fill(c, '0');
            for (int j = 0; j < n; j++) {
                c[j] = (char) ('0' + ints[j] ^ ints[0]);
            }
            hashMap.merge(new String(c), 1, Integer::sum);
        }
        //System.out.println(hashMap);
        int res = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            res = Math.max(res, entry.getValue());
        }
        return res;
    }
}
