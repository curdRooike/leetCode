package week22;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 89. 格雷编码
 * @date 2023/2/23 00:36:40
 */
public class Test7_7 {
    public static void main(String[] args) {
        System.out.println(1 ^ 2);
        System.out.println(new Test7_7().grayCode(2));
    }
    public List<Integer> grayCode(int n) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            System.out.println(i);
            System.out.println(i >> 1);
            ret.add((i >> 1) ^ i);
        }
        return ret;
    }
}
