package week9;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1668. 最大重复子字符串(dp) + 暴力
 * @date 2022/11/3 01:03:35
 */
public class Test4 {
    public static void main(String[] args) {
        String s1 = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String s2 = "aaaba";
        System.out.println(new Test4().maxRepeating(s1, s2));
    }
    /*public int maxRepeating(String sequence, String word) {
        int n = sequence.length(), m = word.length();
        if (n < m) {
            return 0;
        }

        int[] f = new int[n];
        for (int i = m - 1; i < n; ++i) {
            boolean valid = true;
            for (int j = 0; j < m; ++j) {
                if (sequence.charAt(i - m + j + 1) != word.charAt(j)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                f[i] = (i == m - 1 ? 0 : f[i - m]) + 1;
            }
        }
        for (int i : f) {
            System.out.print(i + "\t");
        }
        System.out.println();
        return Arrays.stream(f).max().getAsInt();
    }*/
    public int maxRepeating(String sequence, String word) {
        char[] seqArr = sequence.toCharArray(), wordArr = word.toCharArray();
        if(wordArr.length > seqArr.length)return 0;
        int i = 0, j = 0, k = 0, cur = 0, lastIdx = -1;
        while(i < seqArr.length){
            if(seqArr[i] != wordArr[j]){
                i -= cur * wordArr.length + j - 1; // wordArr的下标j下标是从0开始的，前cur * wordArr.length + j个必然是相等的，i需要回退
                j = 0;
                cur = 0;
                lastIdx = -1;
                continue;
            }
            if(j == wordArr.length - 1){
                j = 0;
                if(lastIdx == i - wordArr.length)cur++;
                else cur = 1;
                k = Math.max(k, cur);
                lastIdx = i;
                // System.out.printf("%s %s %s\n", k, cur, lastIdx);
            }else j++;

            i++;
        }
        return k;
    }
}
