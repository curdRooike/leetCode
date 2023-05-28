package week36;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2451. 差值数组不同的字符串
 * @date 2023/5/25 00:01:53
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5().oddString(new String[]{"aaa","bob","ccc","ddd"}));
    }
    public String oddString(String[] words) {
        String res = words[0];
        int n = res.length();
        int[] rs = new int[n - 1];
        int flag = 0;
        int i = 0 , k = 0;
        for (String word : words) {
            int[] rs1 = new int[n - 1];
            for (int j = 1; j < n; j++) {
                int num = word.charAt(j)
                        - word.charAt(j - 1);
                    if (i == 0)
                        rs[j - 1] = num;
                    else
                        rs1[j - 1] = num;
            }
            if (i > 0 && !Arrays.equals(rs,rs1)){
                flag++;
                k = i;
            }
            i++;
        }
        if (flag > 1)
            return res;
        else return words[k];
    }
}
