package week21;



/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 剑指 Offer 10- I. 斐波那契数列
 * @date 2023/2/13 00:56:49
 */
public class Test4 {

    public static void main(String[] args) {
        System.out.println(new Test4().fib(5));
    }
    static int mod = (int)1e9+7;
    static int N = 110;
    static int[] cache = new int[N];
    public int fib(int n) {
        if (n <= 1) return n;
        if (cache[n] != 0) return cache[n];
        cache[n] = fib(n - 1) + fib(n - 2);
        cache[n] %= mod;
        return cache[n];
    }
}
