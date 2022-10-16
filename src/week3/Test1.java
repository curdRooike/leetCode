package week3;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 排列银币
 * @date 2022/9/21 12:46:39
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().arrangeCoins(5));
    }
    public int arrangeCoins(int n) {
        int left = 1,right = n;
        while (left < right){
            int mid = (right - left+1) / 2 + left;
            if ((long) mid * (mid+1) <= (long) 2 * n){
                left = mid;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }
}
