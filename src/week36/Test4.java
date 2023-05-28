package week36;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1090. 受标签影响的最大值
 * @date 2023/5/23 10:39:49
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().largestValsFromLabels(new int[]{5, 4, 3, 2, 1}
                , new int[]{1, 1, 2, 2, 3}, 3, 1));
    }
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        int n = values.length;
        Integer[] va = new Integer[n];
        for (int i = 0; i < n; i++) {
            va[i] = i;
        }
        Arrays.sort(va, (a, b) -> values[b] - values[a]);
        Map<Integer, Integer> hashMap = new HashMap<>();
        int ans = 0;
        int flag = 0;
        for (int i = 0; i < n && flag < numWanted; i++) {
            int label = labels[va[i]];
            if (hashMap.getOrDefault(label, 0) == useLimit)
                continue;
            ans += values[va[i]];
            hashMap.put(label,hashMap.getOrDefault(label, 0) + 1);
            flag++;
        }
        return ans;
    }
}
