package week20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1233. 删除子文件夹
 * @date 2023/2/8 00:13:05
 */
public class Test6 {
    public static void main(String[] args) {
        String[] s = {"/a","/a/b","/c/d","/c/d/e","/c/f"};
        System.out.println(new Test6().removeSubfolders(s));
    }

    /**
     * 删除子文件夹
     *
     * @param folder 文件夹
     * @return {@link List}<{@link String}>
     */
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        ans.add(folder[0]);
        for (int i = 1; i < folder.length; i++) {
            int pre = ans.get(ans.size() - 1).length();
            if (!(pre < folder[i].length() && ans.get(ans.size() - 1).
                    equals(folder[i].substring(0,pre))
            && folder[i].charAt(pre) == '/')){
                ans.add(folder[i]);
            }
        }
        return ans;
    }
}
