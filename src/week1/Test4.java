package week1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 查找共用字符(hash)
 * @date 2022/9/9 10:32:28
 */
public class Test4 {
    public static void main(String[] args) {
        String []a = {"cool","lock","cook"};
        new Test4().commonChars(a).forEach(System.out::println);
    }
    public List<String> commonChars(String[] words) {
        ArrayList<String> result = new ArrayList<>();
        if (words.length == 0) {
            return result;
        }
        int[] hash = new int[26];
        for (int i = 0; i < words[0].length(); i++) {
            hash[words[0].charAt(i)-'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] hashOther = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                hashOther[words[i].charAt(j) - 'a']++;
            }
            for (int k = 0; k < 26; k++) {
                hash[k] = Math.min(hash[k],hashOther[k]);
            }
        }
        for (int i = 0; i < 26; i++) {
            while (hash[i] != 0){
                char c= (char) (i + 'a');
                result.add(String.valueOf(c));
                hash[i]--;
            }
        }
        return result;
    }
}
