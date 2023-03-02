package week23;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1144. 递减元素使数组呈锯齿状
 * @date 2023/2/27 09:28:09
 */
public class Test4 {
    public static void main(String[] args) {
        int []a = {9,6,5,6,2};
        System.out.println(new Test4().movesToMakeZigzag(a));
    }
    public int movesToMakeZigzag(int[] nums) {
        return Math.min(movesTo(nums,0),movesTo(nums,1));
    }
    public int movesTo(int[] nums,int pos) {
        int s = 0;
        for (int i = pos; i < nums.length; i+=2) {
            int res = 0;
            if (i - 1 >=0)
                res = Math.max(res , nums[i] - nums[i - 1] + 1);
            if (i + 1 < nums.length)
                res = Math.max(res , nums[i] - nums[i + 1] + 1);
            s += res;
        }
        return s;
    }
}
