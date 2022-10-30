package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 784. 字母大小写全排列(递归)
 * @date 2022/10/30 17:53:34
 */
public class Test8 {
    public static void main(String[] args) {
        System.out.println(new Test8().letterCasePermutation("ab"));
    }
    public List<String> letterCasePermutation(String s) {
        return letterCasePermutation(s,0);

    }
    public List<String> letterCasePermutation(String s,int i) {
        if (i == s.length())
            return Collections.singletonList("");
        char c = s.charAt(i);
        ArrayList<Character> headList = new ArrayList<Character>() {{
            add(c);
        }};
        if (c >= 'A')
            headList.add((char)(c ^ 32));
        List<String> tail = letterCasePermutation(s, i + 1);
        System.out.println(tail);
        ArrayList<String> ret = new ArrayList<>();
        for (String t : tail) {
            for (char head : headList) {
                ret.add(head + t);
            }

        }
        return ret;
    }
}
