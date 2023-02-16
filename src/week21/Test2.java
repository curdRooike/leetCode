package week21;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2335. 装满杯子需要的最短总时长
 * @date 2023/2/11 00:54:03
 */
public class Test2 {
    public static void main(String[] args) {
        int []a = {1,4,2};
        System.out.println(new Test2().fillCups(a));
    }
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        if (amount[2] > amount[1] + amount[0]) {
            return amount[2];
        }
        return (amount[0] + amount[1] + amount[2] + 1) / 2;
    }
 }
