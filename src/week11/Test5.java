package week11;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1732. 找到最高海拔
 * @date 2022/11/19 01:20:49
 */
public class Test5 {
    public static void main(String[] args) {

    }
    public int largestAltitude(int[] gain) {
        int ans = 0, sum = 0;
        for (int x : gain) {
            sum += x;
            ans = Math.max(ans, sum);
        }
        return ans;

    }
}
