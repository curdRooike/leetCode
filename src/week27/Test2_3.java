package week27;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1103. 分糖果 II
 * @date 2023/3/26 01:57:25
 */
public class Test2_3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Test2_3().distributeCandies(7, 4)));
    }
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int i = 0;
        while (candies > 0){
            res[i % num_people] = Math.min(candies,i + 1);
            candies -= Math.min(candies,i + 1);
                    i++;
        }
        return res;
    }
}
