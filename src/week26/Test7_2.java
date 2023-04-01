package week26;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 621. 任务调度器
 * @date 2023/3/24 13:07:17
 */
public class Test7_2 {
    public static void main(String[] args) {
        System.out.println(new Test7_2().
                leastInterval(new char[]{'A', 'A','A','A','A','A','B','C','D','E','F','G'}, 2));
    }
    public int leastInterval(char[] tasks, int n) {
        int[] hash = new int[26];
        for (char task : tasks) {
            hash[task - 'A']++;
        }
        int max = 0, tot = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max,hash[i]);
        }

        System.out.println(Arrays.toString(hash));
        for (int i = 0; i < 26; i++) tot += max == hash[i] ? 1 : 0;
        System.out.println(tot);
        return Math.max(tasks.length, (n + 1) * (max - 1) + tot);
    }
}
