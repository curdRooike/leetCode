package week4;

/**
 * @project leetcode
 * @description 205. 同构字符串
 * @author 古丶野
 * @date 2022/9/27 22:44:10
 * @version 1.0
 */public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().isIsomorphic("aabca", "eedfe"));
    }
    public boolean isIsomorphic(String s, String t) {
       return isIsomorphicHelper(s).equals(isIsomorphicHelper(t));
    }
    private String isIsomorphicHelper(String s) {
        int[] map = new int[128];
        int count = 1;
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            //当前字母第一次出现,赋值
            if (map[c] == 0) {
                map[c] = count;
                count++;
            }
            sb.append(map[c]);
        }
        System.out.println(sb);
        return sb.toString();
    }

}
