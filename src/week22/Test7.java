package week22;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1238. 循环码排列
 * @date 2023/2/23 00:14:58
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().circularPermutation(2, 3));
    }
    public List<Integer> circularPermutation(int n, int start) {
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < 1 << n; i++) {
            ret.add((i >> 1) ^ i ^ start);
        }
        return ret;

    }
}
