package week37;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2517. 礼盒的最大甜蜜度
 * @date 2023/6/1 08:38:12
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().
                maximumTastiness(new int[]{13, 5, 1, 8, 21, 2}, 3));
    }
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int left = 0, right = (price[price.length - 1] - price[0]) / (k - 1) + 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (f(price, mid) >= k) left = mid;
            else right = mid;
        }
        return left;
    }
    private int f(int[] price, int d) {
        int cnt = 1, pre = price[0];
        for (int i : price) {
            if (i >= pre + d){
                cnt++;
                pre = i;
            }
        }
        return cnt;
    }
}
