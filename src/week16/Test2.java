package week16;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1662. 检查两个字符串数组是否相等
 * @date 2023/1/7 15:26:19
 */
public class Test2 {
    public static void main(String[] args) {

    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int p1 = 0, p2 = 0, i = 0, j = 0;
        while (p1 < word1.length && p2 < word2.length) {
            if (word1[p1].charAt(i) != word2[p2].charAt(j)) {
                return false;
            }
            i++;
            if (i == word1[p1].length()) {
                p1++;
                i = 0;
            }
            j++;
            if (j == word2[p2].length()) {
                p2++;
                j = 0;
            }
        }
        return p1 == word1.length && p2 == word2.length;

    }
}
