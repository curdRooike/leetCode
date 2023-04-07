package week28;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 831. 隐藏个人信息
 * @date 2023/4/1 21:38:07
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().maskPII("1(234)567-890"));
    }
    public String maskPII(String s) {
        String[] country = {"", "+*-", "+**-", "+***-"};
        int at = s.indexOf("@");
        if (at > 0) {
            s = s.toLowerCase();
            return (s.charAt(0) + "*****" + s.substring(at - 1)).toLowerCase();
        }
        s = s.replaceAll("[^0-9]", "");
        //System.out.println(s);
        StringBuilder sv = new StringBuilder();
        sv.append(country[s.length() - 10])
                .append( "***-***-")
                .append(s.substring(s.length() -4));

        return sv.toString();
    }
}
