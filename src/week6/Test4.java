package week6;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 434. 字符串中的单词数
 * @date 2022/10/13 14:10:36
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().countSegments(" "));
    }
    public int countSegments(String s) {
        String[] words = s.trim().split("\\s+");
        if (words[0].isEmpty())
            return words.length > 1 ? words.length : 0;
        return words.length;
    }
}
