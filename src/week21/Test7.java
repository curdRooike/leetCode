package week21;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2341. 数组能形成多少数对
 * @date 2023/2/16 00:47:03
 */
public class Test7 {
    public static void main(String[] args) {
        int []a = {1,3,2,1,3,2,2};
        System.out.println(Arrays.toString(new Test7().numberOfPairs(a)));
    }
    public int[] numberOfPairs(int[] nums) {
        int[] hash = new int[100];
        for (int num : nums) {
            hash[num]++;
        }
        int[] res = new int[2];
        int flag = 0;
        int flag1 = 0;
        for (int i : hash) {
            if (i == 0) {
                continue;
            }
            flag += (i / 2);
            flag1 += (i % 2);
        }
        res[0] = flag;
        res[1] = flag1;
        return res;
    }
}
