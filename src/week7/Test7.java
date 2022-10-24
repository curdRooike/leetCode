package week7;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 520. 检测大写字母
 * @date 2022/10/22 02:01:32
 */
public class Test7 {
    public static void main(String[] args) {
        new Test7().detectCapitalUse("asdasd");
    }
    public boolean detectCapitalUse(String word) {
        // 若第 1 个字母为小写，则需额外判断第 2 个字母是否为小写
        if (word.length() >= 2 && Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            return false;
        }

        // 无论第 1 个字母是否大写，其他字母必须与第 2 个字母的大小写相同
        for (int i = 2; i < word.length(); ++i) {
            if (Character.isLowerCase(word.charAt(i)) ^ Character.isLowerCase(word.charAt(1))) {
                return false;
            }
        }
        return true;
    }

}
