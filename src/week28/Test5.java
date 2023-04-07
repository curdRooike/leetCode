package week28;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2427. 公因子的数目
 * @date 2023/4/5 00:04:15
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5().commonFactors(12, 6));
    }
    public int commonFactors(int a, int b) {
        int j = Math.min(a,b);
        int count = 0;
        for (int i1 = 1; i1 <= j; i1++) {
            if (a % i1==0 && b %i1 == 0)
                count++;
        }
        return count;
    }
}
