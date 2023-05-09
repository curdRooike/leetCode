package week33;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2437. 有效时间的数目
 * @date 2023/5/9 00:49:11
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().countTime("?5:00"));
    }
    public int countTime(String time) {
        return count(time.substring(0, 2), 24) * count(time.substring(3), 60);
    }
    private int count(String time, int period) {
        char[] t = time.toCharArray();
        int ans = 0;
        for (int i = 0; i < period; i++){
            if ((t[0] == '?' || i / 10 == t[0] - '0') &&
                    (t[1] == '?' || i % 10 == t[1] - '0'))
                ans++;

        }
        return ans;
    }
}
