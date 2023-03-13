package week24;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2379. 得到 K 个黑块的最少涂色次数
 * @date 2023/3/9 00:11:34
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().minimumRecolors("WBBWWBBWBW", 7));
    }
    public int minimumRecolors(String blocks, int k) {
        int l = 0, r = 0, cnt = 0;
        while (r < k) {
            cnt += blocks.charAt(r) == 'W' ? 1 : 0;
            r++;
        }
        System.out.println(cnt);
        int res = cnt;
        while (blocks.length() > r) {
            cnt += blocks.charAt(r) == 'W' ? 1 : 0;
            cnt -= blocks.charAt(l) == 'W' ? 1 : 0;
            res = Math.min(res, cnt);
            l++;
            r++;
        }
        return res;
    }
}
