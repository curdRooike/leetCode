package week16;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2180. 统计各位数字之和为偶数的整数个数
 * @date 2023/1/6 20:55:32
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().countEven(4));
    }
    public int countEven(int num) {
        int res = 0;
        for (int i = 1; i <= num; i++) {
            int x = i, sum = 0;
            while (x != 0) {
                sum += x % 10;
                x /= 10;
            }
            if (sum % 2 == 0) {
                res++;
            }
        }
        return res;

    }
}
