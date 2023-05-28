package week36;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 55. 跳跃游戏
 * @date 2023/5/20 23:19:15
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().canJump(new int[]{2, 3, 1, 1, 4}));
    }
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int l = 0;
        for (int i = 0; i < n; i++) {
            if (i <= l){
                l = Math.max(l, i + nums[i]);
                if (l >= n - 1)
                    return true;
            }
        }
        return false;
    }
}
