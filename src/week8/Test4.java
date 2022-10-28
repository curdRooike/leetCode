package week8;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1822. 数组元素积的符号
 * @date 2022/10/27 12:32:50
 */
public class Test4 {
    public static void main(String[] args) {
        int[]a = {-1,-2,-3,4,3,0,1};
        System.out.println(new Test4().arraySign(a));
    }
    public int arraySign(int[] nums) {
        int fs = 0;
        for (int num : nums) {
            if (num == 0)
                return 0;
            else if (num <0)
                fs++;
        }
        return fs % 2 == 0 ? 1 : -1;
    }
}
