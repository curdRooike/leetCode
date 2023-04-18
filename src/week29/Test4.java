package week29;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1147. 段式回文
 * @date 2023/4/12 00:55:39
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().
                longestDecomposition("ghiabcdefhelloadamhelloabcdefghi"));
    }
    public int longestDecomposition(String text) {
        int i = 0 ,start = 0;
        int end = text.length();
        int j = end - 1;
        int ans = 0;
        while (start < end){
            if (text.substring(start ,i + 1).equals(text.substring(j, end))){
                ans += 2;
                start = i;
                end = j;
            }
            i++;
            j--;
        }
        if (start > end)
            ans--;
        return ans;
    }
}
