package week32;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1422. 分割字符串的最大得分
 * @date 2023/5/1 02:22:52
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5().maxScore("011101"));
    }
    public int maxScore(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 1; i < n; i++) {
            int t = 0;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == '0') {
                    t++;
                }
            }
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '1') {
                    t++;
                }
            }
            ans = Math.max(ans, t);
        }
        return ans;
    }
}
