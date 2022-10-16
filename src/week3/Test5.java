package week3;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 拆炸弹
 * @date 2022/9/24 20:58:24
 */
public class Test5 {
    public static void main(String[] args) {
        int []a = {2,4,9,3};
        int[] decrypt = new Test5().decrypt(a, -2);

    }
    public int[] decrypt(int[] code, int k) {
        int length = code.length;
        int []arr = new int[length];
        if (k == 0) return arr;
        int sum = 0;
        for (int i = 0; i < Math.abs(k); i++) {
            sum += code[i];// 求和
        }
        System.out.println(sum);
        for (int i = 0; i < length; i++) {
            if (k > 0){
                arr[(i-1+length)%length] = sum;
                System.out.println((i - 1 + length) % length);
            }else {
                System.out.println((i - k + length) % length);
                arr[(i-k+length)%length] = sum;
            }
            sum -= code[i]; //减去下一个code的值
            sum += code[(i+Math.abs(k))%length];//加上当前code值
        }
        return arr;
    }
}
