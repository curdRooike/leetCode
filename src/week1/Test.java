package week1;

import java.util.ArrayList;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 测试stringAPI
 * @date 2022/9/9 11:01:54
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(5);
        for (int i = 0; i < 6; i++) {
            integers.add(i);
        }
        System.out.println(integers);
    }
}
