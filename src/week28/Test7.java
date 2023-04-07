package week28;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1040. 移动石子直到连续 II
 * @date 2023/4/7 23:34:41
 */
public class Test7 {
    public int[] numMovesStonesII(int[] s) {
        Arrays.sort(s);
        int n = s.length;
        int e1 = s[n - 2] - s[0] - n + 2;
        int e2 = s[n - 1] - s[1] - n + 2; // 计算空位
        int maxMove = Math.max(e1, e2);
        if (e1 == 0 || e2 == 0) // 特殊情况：没有空位
            return new int[]{Math.min(2, maxMove), maxMove};
        int maxCnt = 0, left = 0;
        for (int right = 0; right < n; ++right) { // 滑动窗口：枚举右端点所在石子
            while (s[right] - s[left] + 1 > n) // 窗口长度大于 n
                ++left; // 缩小窗口长度
            maxCnt = Math.max(maxCnt, right - left + 1); // 维护窗口内的最大石子数
        }
        return new int[]{n - maxCnt, maxMove};
    }
}