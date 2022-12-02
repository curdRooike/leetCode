package week12;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1758. 生成交替二进制字符串的最少操作数
 * @date 2022/11/29 11:50:29
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().minOperations("1111"));
    }
    public int minOperations(String s) {
        char[] chars = s.toCharArray();
        chars[0] = '1';
        char[] chars1 = s.toCharArray();
        chars1[0] = '0';
        return Math.min(min(chars,s),min(chars1,s));
    }
    public int min(char[] chars,String s){
        int minCount = 0;
        for (int i = 0; i < chars.length-1; i++) {
            if (chars[i] == chars[i+1]) {
                chars[i+1] =  chars[i+1] == '0' ? '1' : '0';
                minCount++;
            }
        }
        return (chars[0] == s.charAt(0)? 0 : 1) + minCount;
    }


}
