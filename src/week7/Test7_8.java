package week7;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1768. 交替合并字符串
 * @date 2022/10/23 19:18:18
 */
public class Test7_8 {
    public static void main(String[] args) {
        System.out.println(new Test7_8().mergeAlternately("abc", "defss"));
    }
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        StringBuilder sb = new StringBuilder();
        int i = 0,j = 0;
        while (i < n || j < m){
            if (i < n){
                sb.append(word1.charAt(i));
                i++;
            }
            if (j < m){
                sb.append(word2.charAt(j));
                j++;
            }
        }
        return sb.toString();
    }

}
