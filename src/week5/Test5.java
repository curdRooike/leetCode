package week5;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1800. 最大升序子数组和
 * @date 2022/10/7 16:28:16
 */
public class Test5 {
    public static void main(String[] args) {
        int []a = {1,5,3,2,4};
        System.out.println(new Test5().maxAscendingSum(a));
    }
    public int maxAscendingSum(int[] nums) {//动态规划
        int res = 0;
        int l = 0;
        while (l < nums.length) {
            int cursum = nums[l++];
            while (l < nums.length && nums[l] > nums[l - 1]) {
                cursum += nums[l++];
            }
            res = Math.max(res, cursum);
        }
        return res;
    }
    /*public int maxAscendingSum(int[] nums) {
        int sum;
        int max = 0;
        if (nums.length == 1)
            return nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            sum = nums[i];
            for (int j = i; j < nums.length-1; j++) {
                if (nums[j] < nums[j+1]) {
                    sum += nums[j+1];
                }else
                    break;
            }
            max = Math.max(max,sum);
        }
        return max;
    }*/
}
