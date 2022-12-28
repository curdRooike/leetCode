package week14;

/**
 * @projectName leetcode
 * @Description 1832. 判断句子是否为全字母句
 * @Author 古丶野
 * @Date 2022/12/13 15:16
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    /**
     * 检查是否全字母短句
     *
     * @param sentence 句子
     * @return boolean
     */
    public boolean checkIfPangram(String sentence) {
        int flag = 0;
        for (int i = 0; i < sentence.length(); i++) {
            flag |= 1 << (sentence.charAt(i) - 'a');
        }

        return flag == (1 << 26) -1;
    }
}
