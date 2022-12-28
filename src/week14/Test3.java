package week14;

/**
 * @projectName leetcode
 * @Description 1945. 字符串转化后的各位数字之和
 * @Author 古丶野
 * @Date 2022/12/15 1:11
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().getLucky("iiii", 1));
    }

    /**
     * 会很幸运
     *
     * @param s 年代
     * @param k k
     * @return int
     */
    public int getLucky(String s, int k) {
        int num = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            num = 0;

            for (int j = 0; j < s.length() && i == 0; j++) {
                sb.append( s.charAt(j) - 'a' + 1);
            }
            for (char c : sb.toString().toCharArray()) {
                num += c-'0';
            }

            if (num < 10)
                return num;
            sb = new StringBuilder(String.valueOf(num));

        }
        return num;
    }
}
