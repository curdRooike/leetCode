package week33;

import util.SoutUtil;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1419. 数青蛙
 * @date 2023/5/6 23:32:20
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(PREVIOUS['a']);
        System.out.println(new Test4().minNumberOfFrogs("croakcroak"));
    }
    // 数组比哈希表快。's' 保证 "croak" 中的任意字符都不会越界
    private static final char[] PREVIOUS = new char['s'];

    static { // 预处理每个字母在 "croak" 中的上一个字母
        char[] s = "croakc".toCharArray();
        for (int i = 1; i < s.length; i++)
            PREVIOUS[s[i]] = s[i - 1];
    }

    public int minNumberOfFrogs(String croakOfFrogs) {
        int[] cnt = new int['s'];
        for (char c : croakOfFrogs.toCharArray()) {
            char pre = PREVIOUS[c];
            if (cnt[pre] > 0) {
                cnt[pre]--;
            }
            else if (c != 'c') // 否则青蛙必须从 'c' 开始蛙鸣
                return -1; // 不符合要求
            cnt[c]++; // 发出了 ch 的声音
        }
        if (cnt['c'] > 0 || cnt['r'] > 0 || cnt['o'] > 0 || cnt['a'] > 0)
            return -1; // 有发出其它声音的青蛙，不符合要求
        return cnt['k']; // 最后青蛙们都发出了 'k' 的声音
    }

}
