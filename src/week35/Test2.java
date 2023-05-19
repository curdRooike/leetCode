package week35;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 剑指 Offer 10- II. 青蛙跳台阶问题
 * @date 2023/5/16 15:38:40
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().numWays(2));
    }
    public int numWays(int n) {
       int a = 1, b = 0, sum = 1;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            b = a;
            a = sum;
        }
        return sum;
    }
}
