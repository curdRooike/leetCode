package week10;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1684. 统计一致字符串的数目(位运算)
 * @date 2022/11/8 00:20:29
 */
public class Test2 {
    public static void main(String[] args) {
        String s = "ab";
        String []s1 = {"ad","bd","aaab","bba","badab"};
        System.out.println(new Test2().countConsistentStrings(s, s1));
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int mask = 0;
        for (int i = 0; i < allowed.length(); i++) {
            char c = allowed.charAt(i);
            System.out.println(c + ":"+ (1 <<(c - 'a')));
            mask |= 1 << (c - 'a');
        }
        System.out.println(mask);
        int res = 0;
        for (String word : words) {
            int mask1 = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                mask1 |= 1 << (c - 'a');
            }
            if ((mask1 | mask) == mask) {
                res++;
            }
        }
        return res;
    }
}
