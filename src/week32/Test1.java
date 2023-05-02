package week32;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2423. 删除字符使频率相同
 * @date 2023/4/29 00:30:50
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().equalFrequency("ddaccb"));
    }
    public boolean equalFrequency(String word) {
        int n = word.length();
        int[] cnt = new int[26];

        for (int i = 0; i < n; i++) {
            cnt[word.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (cnt[i] > 0) {
                cnt[i]--;
                if (check(cnt)) return true;
                cnt[i]++;
            }
        }
        return false;
    }

    boolean check(int[] a) {
        int last = 0;
        for (int j : a) {
            if (j == 0) continue;
            if (last == 0) {
                last = j;
            } else if (j != last) return false;
        }
        return true;
    }
}
