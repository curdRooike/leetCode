package week6;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 345. 反转字符串中的元音字母(hash法)
 * @date 2022/10/14 15:51:26
 */
public class Test5_6 {
    public static void main(String[] args) {
        System.out.println(new Test5_6().reverseVowels("hello"));
    }
    static boolean[] hash = new boolean[128];
    static char[] chars = {'a','e','i','o','u'};
    static {
        for (char c : chars) {
            hash[c-' '] = hash[Character.toUpperCase(c)-' '] = true;
        }
    }

    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        int n = s.length();
        int i = 0,j = n-1;
        while (i < j){
            if ((hash[array[i]- ' ']) && (hash[array[j]-' '])) {
                swap(array,i,j);
                i++;
                j--;
            }
            else {
                if (!hash[array[i] - ' ']) i++;
                if (!hash[array[j] - ' ']) j--;
            }
        }
        return String.valueOf(array);
    }
    void swap(char[] cc,int i,int j){
        char c = cc[i];
        cc[i] = cc[j];
        cc[j] = c;
    }
}
