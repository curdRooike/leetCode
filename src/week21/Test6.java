package week21;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1124. 表现良好的最长时间段
 * @date 2023/2/15 02:13:56
 */
public class Test6 {
    public static void main(String[] args) {
        int []a = {9,9,6,0,6,6,9};
        System.out.println(new Test6().longestWPI(a));
    }
    public int longestWPI(int[] hours) {
        int ans = 0, s = 0;
        Map<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < hours.length; ++i) {
            s += hours[i] > 8 ? 1 : -1;
            if (s > 0) {
                ans = i + 1;
            }else if (pos.containsKey(s - 1)){
                ans = Math.max(ans, i - pos.get(s - 1));
            }
            pos.putIfAbsent(s, i);
        }
        System.out.println(pos);
        return ans;
    }
}
