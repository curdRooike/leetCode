package week33;

import util.SoutUtil;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1010. 总持续时间可被 60 整除的歌曲
 * @date 2023/5/7 01:46:40
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5().numPairsDivisibleBy60(
                new int[]{20, 40}));
    }
    public int numPairsDivisibleBy60(int[] time) {
        int ans = 0;
        int[] hash = new int[60];
        for (int t : time) {
            ans += hash[(60 - t % 60) % 60];
            hash[t % 60]++;
        }
        SoutUtil.ArrayOutNoZero(hash);
        return ans;
    }
}
