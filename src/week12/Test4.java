package week12;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1752. 检查数组是否经排序和轮转得到
 * @date 2022/11/29 12:50:26
 */
public class Test4 {
    public static void main(String[] args) {
        int []a = {4,5,1,2,3};
        System.out.println(new Test4().check(a));
    }
    public boolean check(int[] nums) {
        int t = 0, n = nums.length;
        for (int i = 1; i < n; i++) {
            if (t > 1) return false; // 如果出现超过1次的“非递增”情况，则直接返回false
            if (nums[i - 1] > nums[i]) t++; // 如果出现“非递增”情况，则t加1
        }
        return t == 0 || (t == 1 && nums[0] >= nums[n - 1]);
    }
}
