package week30;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1023. 驼峰式匹配
 * @date 2023/4/18 16:39:32
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().camelMatch(new String[]{"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"}
                , "FB"));
    }
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();
        int n = queries.length;
        for (String query : queries) {
            int p = 0;
            boolean flag = true;
            for (int j = 0; j < query.length(); j++) {
                char c = query.charAt(j);
                if (pattern.length() > p && c == pattern.charAt(p)) {
                    ++p;
                } else if (Character.isUpperCase(c)) {
                    flag = false;
                    break;
                }
            }
            if (p < pattern.length()) {
                flag = false;
            }
            res.add(flag);
        }
        return res;
    }
}
