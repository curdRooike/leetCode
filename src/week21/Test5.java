package week21;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1250. 检查「好数组」
 * @date 2023/2/15 01:56:58
 */
public class Test5 {
    public static void main(String[] args) {
        int []a = {12,5,7,23};
        System.out.println(new Test5().isGoodArray(a));
    }
    public boolean isGoodArray(int[] nums) {
        int divisor = nums[0];
        for (int num : nums) {
            divisor = gcd(divisor, num);
            if (divisor == 1) {
               return true;
            }
        }
        return false;
    }

    public int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1;
            num1 = num2;
            num2 = temp % num2;
        }
        return num1;
    }
}
