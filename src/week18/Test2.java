package week18;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 338. 比特位计数
 * @date 2023/1/21 00:54:15
 */
public class Test2 {
    public static void main(String[] args) {

    }

    /**
     * 计算部分
     *
     * @param n n
     * @return {@link int[]}
     */
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            bits[i] = bits[i & (i - 1)] + 1;
        }
        return bits;
    }

}
