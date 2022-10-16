package week3;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 反转字符串二
 * @date 2022/9/21 14:49:18
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().reverseStr("abcdefg", 2));
    }
    public String reverseStr(String s, int k) {
        char[] array = s.toCharArray();
        int length = array.length;
        for (int start = 0; start < length; start += 2 * k) {
            int end = Math.min(start + k - 1, length - 1);
            for (int i = start, j = end; i < j; i++, j--) {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return new String(array);
    }


}
