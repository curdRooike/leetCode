package week14;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description ss
 * @date 2022/12/21 15:29:22
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5().countHomogenous("abbcccaa"));
    }
    public int countHomogenous(String s) {
        long ans = 1,cnt = 1, n = s.length();
        for (int i = 1; i < n; i++) {
            ans += cnt = s.charAt(i) == s.charAt(i - 1) ? ++cnt : 1;
        }
        return (int)(ans % 1000000007);
    }
}
