package week17;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2287. 重排字符形成目标字符串
 * @date 2023/1/13 13:52:59
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().rearrangeCharacters("ilovecodingonleetcode", "code"));
    }
    public int rearrangeCharacters(String s, String target) {
        int[] hashTarget=new int[26],hashS=new int[26];
        for (int i = 0; i < s.length(); i++) {
            hashS[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < target.length(); i++) {
            hashTarget[target.charAt(i)-'a']++;
        }
        int ans=s.length();
        for (int i = 0; i < 26; i++) {
            if (hashTarget[i]==0){
                continue;
            }
            ans=Math.min(ans,hashS[i]/hashTarget[i]);
        }

        return ans;
    }
}
