package week8;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 分割数组
 * @date 2022/10/24 11:02:10
 */
public class Test1 {
    public static void main(String[] args) {
        int[] a = {5,7,0, 3, 8, 6};
        System.out.println(new Test1().partitionDisjoint(a));
    }

    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int leftMax = nums[0], leftPos = 0, curMax = nums[0];
        for (int i = 1; i < n - 1; i++) {
            curMax = Math.max(curMax, nums[i]);
            if (nums[i] < leftMax) {
                leftMax = curMax;
                leftPos = i;
            }
        }
        return leftPos + 1;
    }


}