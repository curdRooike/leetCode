package week5;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 231. 2 的幂 (位运算)
 * @date 2022/10/6 10:41:25
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().isPowerOfTwo(3));
    }
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n-1)) == 0;
    }
}
