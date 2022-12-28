package week14;

/**
 * @projectName leetcode
 * @Description 2259. 移除指定数字得到的最大结果
 * @Author 古丶野
 * @Date 2022/12/14 10:29
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().removeDigit("1316181", '1'));
    }

    /**
     * 删除数字
     *
     * @param number 数量
     * @param digit  数字
     * @return {@link String}
     */
    public String removeDigit(String number, char digit) {
        int n = number.length();
        StringBuilder sb = new StringBuilder();
        int removeIdx = -1;
        for (int i = 0; i < n; i++) {
            if (number.charAt(i) == digit) {
                removeIdx = i;
                if (i < n - 1 && number.charAt(i + 1) > digit) {
                    break;
                }
            }
        }
        sb.append(number, 0, removeIdx)
                .append(number.substring(removeIdx + 1));
        return sb.toString();
    }
}
