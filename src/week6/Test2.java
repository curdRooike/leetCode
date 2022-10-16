package week6;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1790. 仅执行一次字符串交换能否使两个字符串相等
 * @date 2022/10/11 12:03:29
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().areAlmostEqual("npv", "zpn"));
    }

    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[] ints = new int[n];
        if (m != n)
            return false;
        if (s1.equals(s2))
            return true;
        int i = 0,num = 0;
        while (i < n){
            if (s1.charAt(i) == s2.charAt(i)) {
                i++;
                continue;
            }
            else {
                ints[num] = i;
                if (num++ > 1)
                    return false;
            }
            i++;
        }
        if (num == 1) return false;
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        return s1.charAt(ints[0]) == s2.charAt(ints[1]) && s1.charAt(ints[1]) == s2.charAt(ints[0]);
    }
}
