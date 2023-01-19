package week17;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2299. 强密码检验器 II
 * @date 2023/1/19 12:52:47
 */
public class Test7 {
    public static String chars = "!@#$%^&*()-+";
    public static void main(String[] args) {
        System.out.println(new Test7().strongPasswordCheckerII("IloveLe3tcode!"));
    }

    /**
     * 强密码检查二世
     *
     * @param password 密码
     * @return boolean
     */
    public boolean strongPasswordCheckerII(String password){
        int length = password.length();
        if ((length < 8)) {
            return false;
        }
        int number = 0,special = 0;
        char[] chars1 = password.toCharArray();
        for (int i = 0; i < length; i++) {
            char c = chars1[i];
            if (i < length - 1 && c == chars1[i + 1])
                return false;
            if (chars.contains(String.valueOf(c)))
                special++;
            else if (c - '0' <= 9 && c - '0' >= 0)
                number++;
        }
        if ((number > 0 && special > 0) &&
                !(password.toLowerCase().equals(password) || password.equals(password.toUpperCase()))) {
            return true;
        }
        return false;
    }
}
