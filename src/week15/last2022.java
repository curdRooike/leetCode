package week15;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2037. 使每位学生都有座位的最少移动次数(2022年最后一题)
 * @date 2023/1/1 21:03:44
 */
public class last2022 {
    public static void main(String[] args) {
        int []student = {4,1,5,9};
        int []address = {1,3,2,6};
        System.out.println(new last2022().minMovesToSeat(student, address));
    }
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int res = 0;
        for (int i = 0; i < seats.length; i++) {
            res += Math.abs(seats[i] - students[i]);
        }
        return res;

    }
}
