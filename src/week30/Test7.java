package week30;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1163. 按字典序排在最后的子串
 * @date 2023/4/25 17:45:28
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().lastSubstring("abab"));
    }
    public String lastSubstring(String s) {
       int n = s.length();
       int i = 0;
        for (int j = 1,k = 0; j + k < n;) {
            int  d = s.charAt(i + k) - s.charAt(j + k);
            if (d == 0) {
                k++;
            }else if (d < 0){
                i += k + 1;
                k = 0;
                if (i >= j){
                    j = i + 1;
                }
            }else {
                j += k + 1;
                k = 0;
            }
        }
        return s.substring(i);
    }
}
