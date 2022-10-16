package week5;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 367. 有效的完全平方数
 * @date 2022/10/9 08:51:57
 */
public class Test9 {
    public static void main(String[] args) {
        System.out.println(new Test9().isPerfectSquare(8));
    }
    public boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            System.out.println(mid);
            long square = (long) mid * mid;
            if (square < num) {
                left = mid + 1;
            } else if (square > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
