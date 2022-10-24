package week7;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 507.完美数
 * @date 2022/10/17 21:00:19
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().checkPerfectNumber(7));
    }
    public boolean checkPerfectNumber(int num) {
        if (num == 1)
            return false;
        int sum = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return 1+sum == num;
    }
}
