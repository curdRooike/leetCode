package week29;


import util.SoutUtil;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1125. 最小的必要团队
 * @date 2023/4/8 20:36:27
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().checkDistances("zz", new int[]{
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1
        }));
    }
    public boolean checkDistances(String s, int[] distance) {
        int[] hash = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (hash[chars[i] - 'a'] != 0) {
                hash[chars[i] - 'a'] = i - hash[chars[i] - 'a'];

            }else {
                hash[chars[i] - 'a'] = i + 1;
            }
        }
        SoutUtil.ArrayOut(hash);
        for (int i = 0; i < distance.length; i++) {
            if (s.contains(String.valueOf((char)(i + 'a')))) {
                if (distance[i] != hash[i])
                    return false;
            }else continue;
        }
        return true;
    }
}
