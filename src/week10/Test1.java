package week10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 816. 模糊坐标
 * @date 2022/11/7 00:07:06
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().ambiguousCoordinates("(123)"));
    }
    public List<String> ambiguousCoordinates(String s) {
        int n = s.length()-2;
        s=s.substring(1,n+1);
        ArrayList<String> res = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            List<String> split1 = findSplit(s.substring(0, i));
            List<String> split2 = findSplit(s.substring(i));
            for (String s1 : split1) {
                for (String s2 : split2) {
                    res.add("("+s1+", "+s2+")");
                }
            }
        }
        return res;
    }
    List<String> findSplit(String s){
        List<String> list=new ArrayList<>();
        if(s.length()==1||s.charAt(0)!='0'){list.add(s);}
        for(int i=1;i<s.length();i++){
            String s1=s.substring(0,i),s2=s.substring(i);
            if((s1.length()==1||s1.charAt(0)!='0')&&s2.charAt(s2.length()-1)!='0'){list.add(s1+"."+s2);}
        }
        return list;
    }
}
