package week17;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2293. 极大极小游戏
 * @date 2023/1/15 17:04:52
 */
public class Test3 {
    public static void main(String[] args) {
        int []a = {1,3,5,2,4,8,2,2};
        System.out.println(new Test3().minMaxGame(a));
    }
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        while (n != 1) {
            int m = n / 2;
            for (int i = 0; i < m; i++) {
                if (i % 2 == 0) {
                    nums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                } else {
                    nums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            n = m;
        }
        return nums[0];
    }
}
