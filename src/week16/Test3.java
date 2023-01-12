package week16;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2185. 统计包含给定前缀的字符串
 * @date 2023/1/8 10:42:37
 */
public class Test3 {
    public static void main(String[] args) {
        String[] strings = {"cullp","ypfyqcljk","jtuogvscob","dsriyigc","fr","jtuogvscou","doivwcgxpo","jtuogvscob","chuiw","fqdhyhkvtz","cszrtrff","kssjy","ps","xvax","vekbmwwnra"};
        System.out.println(new Test3().prefixCount(strings, "jtuogvsco"));
    }
    public int prefixCount(String[] words, String pref) {
        int res = 0;
        int n = pref.length();
        for (String word : words) {
            word.length();
            if (n > word.length())
                continue;
            if (word.substring(0,n).equals(pref))
                res++;
        }
        return res;
    }
}
