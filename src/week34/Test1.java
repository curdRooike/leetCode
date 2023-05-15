package week34;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1015. 可被 K 整除的最小整数
 * @date 2023/5/10 09:57:00
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().smallestRepunitDivByK(7));
    }
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0)
            return -1;
        int x = 1 % k;
        for (int i = 1; ; i++) { // 一定有解
            if (x == 0)
                return i;
            x = (x * 10 + 1) % k;
        }
    }
}
