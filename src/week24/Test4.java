package week24;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1653. 使字符串平衡的最少删除次数
 * @date 2023/3/6 21:05:18
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().minimumDeletions("aababbab"));
    }
    public int minimumDeletions(String s) {
        int res = 0 , cunB = 0;
        for (char c : s.toCharArray()) {
            if (c == 'b')
                cunB++;
            else
                res = Math.min(res + 1 ,cunB);
        }
        return res;
    }
}
