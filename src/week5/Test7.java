package week5;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 326. 3 的幂
 * @date 2022/10/8 09:17:15
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().isPowerOfThree(9));
    }
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

}
