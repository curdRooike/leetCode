package week17;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1813. 句子相似性 III
 * @date 2023/1/16 01:03:36
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().areSentencesSimilar("My name is Haley", "My Haley"));
    }
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        int i = 0,j = 0;
        while (s1.length > i && s2.length > i && s1[i].equals(s2[i])) {
            i++;
        }
        System.out.println(i);
        while (s1.length - i > j && s2.length - i > j && s1[s1.length - j - 1].equals(s2[s2.length - 1 -j])) {
            j++;
        }
        System.out.println(j);
        return i+j == Math.min(s1.length,s2.length);
    }
}
