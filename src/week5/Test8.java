package week5;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 4的幂
 * @date 2022/10/8 09:27:50
 */
public class Test8 {
    public static void main(String[] args) {
        System.out.println(new Test8().isPowerOfFour(16));
    }
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
    }


}
