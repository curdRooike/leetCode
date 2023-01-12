package week16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1807. 替换字符串中的括号内容
 * @date 2023/1/12 14:20:24
 */
public class Test7 {
    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list.add("name");
        list.add("bob");
        lists.add(list);
        list1.add("age");
        list1.add("two");
        lists.add(list1);
        System.out.println(new Test7().evaluate("(name)is(age)yearsold", lists));
    }
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> ha = new HashMap<>();
        for (List<String> strings : knowledge) {
            ha.put(strings.get(0),strings.get(1));
        }
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                StringBuilder temp = new StringBuilder();
                while (arr[++i] != ')')
                    temp.append(arr[i]);
                sb.append(ha.getOrDefault(temp.toString(),"?"));
            }else sb.append(arr[i]);
        }
        return sb.toString();
    }
}
