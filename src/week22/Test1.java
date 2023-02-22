package week22;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1175. 质数排列
 * @date 2023/2/17 00:28:05
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().numPrimeArrangements(5));
    }
    static final int MOD = 1000000007;
    public int numPrimeArrangements(int n) {
        int numPrimes = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                numPrimes++;
            }
        }
        return (int) (factorial(numPrimes) * factorial(n - numPrimes) % MOD);
    }
    public boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public long factorial(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
            res %= MOD;
        }
        return res;
    }
}
