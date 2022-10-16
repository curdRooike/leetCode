package week1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 快乐数
 * @date 2022/9/13 17:30:42
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().isHappy(1111111));
    }

    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
}
