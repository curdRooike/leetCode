package week7;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 461. 汉明距离
 * @date 2022/10/22 01:20:50
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6().hammingDistance(1, 4));
    }
    public int hammingDistance(int x, int y) {
        int s = x ^ y, ret = 0;
        while (s != 0) {
            s &= s - 1;
            ret++;
        }
        return ret;
    }

}
