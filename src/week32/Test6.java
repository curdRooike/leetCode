package week32;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 970. 强整数
 * @date 2023/5/2 03:29:22
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6().powerfulIntegers(2, 3, 10));
    }
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();
        if(x == 1 && y == 1) {
            // 如果两个都为 1
            if(bound < 2) {
                return new ArrayList<>();
            }
            return Collections.singletonList(2);
        } else if(x == 1) {
            // 交换之后 x 不为 1 , 方便处理
            x = y;
            y = 1;
        }
        for(int x_i = 1; x_i <= bound;x_i *= x) {
            if(y == 1) {
                set.add(x_i + 1);
            }else {
                for(int y_j = 1;x_i + y_j <= bound;y_j *= y) {
                    set.add(x_i + y_j);
                }
            }
        }
        return new ArrayList<>(set);
    }
}
