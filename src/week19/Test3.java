package week19;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2315. 统计星号
 * @date 2023/1/30 15:26:07
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().countAsterisks("l|*e*et|c**o|*de|"));
    }
    public int countAsterisks(String s) {
        boolean flag = true;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '|') {
                flag = !flag;
            }else if (c == '*' && flag){
                res++;
            }
        }
        return res;
    }
}
