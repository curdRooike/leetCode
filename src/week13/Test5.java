package week13;

/**
 * @projectName leetcode
 * @Description 1827. 最少操作使数组递增
 * @Author 古丶野
 * @Date 2022/12/11 20:21
 * @Version 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        int []a = {1,5,2,4,1};
        System.out.println(new Test5().minOperations(a));
    }
    public int minOperations(int[] nums) {
        int pre = nums[0] - 1, res = 0;
        for (int num : nums) {
            pre = Math.max(pre + 1, num);
            //System.out.println(pre);
            res += pre - num;
        }
        return res;
    }
}
