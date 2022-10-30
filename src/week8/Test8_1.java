package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 字母大小写全排列（迭代）
 * @date 2022/10/30 20:04:43
 */
public class Test8_1 {
    public static void main(String[] args) {
        System.out.println(new Test8_1().letterCasePermutation("ab"));
    }
    public List<String> letterCasePermutation(String s) {
        int n = s.length();
        List<String> ret = Arrays.asList("");
        for (int i = n-1; i >= 0; i--) {
            char c = s.charAt(i);
            List<Character> heads = new ArrayList<Character>(){{add(c);}};
            if (c >= 'A')
                heads.add((char) (c ^ 32));
            List<String> newS = new ArrayList<>();
            for (String string : ret) {
                for (char head : heads) {
                    newS.add(head + string);
                }
            }
            System.out.println(newS);
            ret = newS;
        }
        return ret;
    }
}
