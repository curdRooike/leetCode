package week19;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2325. 解密消息
 * @date 2023/2/1 02:51:16
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6().decodeMessage("the quick brown fox jumps over the lazy dog",
                "vkbs bs t suepuv"));
    }

    /**
     * 解码信息
     *
     * @param key     关键
     * @param message 消息
     * @return {@link String}
     */
    public String decodeMessage(String key, String message) {
        char cur = 'a';
        Map<Character, Character> rules = new HashMap<Character, Character>();

        for (int i = 0; i < key.length(); ++i) {
            char c = key.charAt(i);
            if (c != ' ' && !rules.containsKey(c)) {
                rules.put(c, cur);
                ++cur;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); ++i) {
            char c = message.charAt(i);
            if (c != ' ') {
                c = rules.get(c);
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
