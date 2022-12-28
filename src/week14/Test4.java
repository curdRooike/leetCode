package week14;

/**
 * @projectName leetcode
 * @Description 1785. 构成特定和需要添加的最少元素
 * @Author 古丶野
 * @Date 2022/12/16 9:53
 * @Version 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        int []a = {1,-1,1};
        System.out.println(new Test4().minElements(a, 3, -4));
    }
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int x : nums) {
            sum += x;
        }
        long diff = Math.abs(sum - goal);
        return (int) ((diff + limit - 1) / limit);
    }
}
