package week13;

/**
 * @projectName leetcode
 * @Description 1781. 所有子字符串美丽值之和
 * @Author 古丶野
 * @Date 2022/12/12 0:55
 * @Version 1.0
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().beautySum("aabcb"));
    }
    public int beautySum(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] cnt = new int[26];
            int maxFreq = 0;
            for (int j = i; j < s.length(); j++) {
                cnt[s.charAt(j) - 'a']++;
                maxFreq = Math.max(maxFreq, cnt[s.charAt(j) - 'a']);
                int minFreq = s.length();
                for (int k = 0; k < 26; k++) {
                    if (cnt[k] > 0) {
                        minFreq = Math.min(minFreq, cnt[k]);
                    }
                }
                res += maxFreq - minFreq;

            }
        }
        return res;
    }
}
