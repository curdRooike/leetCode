package week24;

import java.util.*;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1487. 保证文件名唯一
 * @date 2023/3/3 19:35:26
 */
public class Test1 {
    public static void main(String[] args) {
        String []s = {"l","p(4)(4)","v","c","i","k(2)","y","a(4)(2)","t","a","e","e(1)(4)","p","p","s","z","s","q(2)(1)","r(1)","m","b(3)","u(2)","j","p","t","s","g","o","o","b(3)(3)","k","w(2)(3)","q","a","z","t(4)(4)","s(2)","c","w","u","h","g","b","r","c(1)","v","n(1)","r(2)(1)","u","t(2)(3)","p","m(3)(1)","h","o","y","n","s","z","k(2)","x(4)","l(1)(4)","g(2)","u","t(2)","m","c","t","g","c","a(2)","r","d","y","b","p","m","w(2)(4)","v","t(4)(2)","x","e(4)(1)","h","f","z","e(1)(4)","t","b(1)","x(4)","m(3)","j(2)(4)","s(3)(2)","z","l","p(2)(2)","g(3)(2)","q(1)(4)","h(1)(1)","h","o(3)","h","f","n(4)","s(4)","g","s","r","n(1)(1)","x(3)","r","f(3)(1)","e","j","s","g","d","l","g","o(4)(3)","x(4)","u(2)(4)","x","t","f","j(1)","v(2)","w","v","t(2)(2)","l","o(1)(1)","a","y","q(4)","m(1)(2)","i","u","l","c(1)","g","l(2)","p(1)(1)","k","d","l","o","m","i(1)","j","i","f","y","b","k","z","n","t","c(2)","y","q","b","t","m","g(1)","r","m","l","s","n","j(4)(4)","m(3)(3)","n","n(2)(3)","s","t","l","e","p","q(2)","v","v","b","w","m","p","g","h(2)","n(1)","q","x(4)","q(2)(4)","s(2)","w","k","f","v","n","q","w","y(3)","a(4)(1)","r(1)","r","f(4)(2)","l","f(2)(3)","p","o","h","t","i","r","k","p","l","o(3)(4)","f(1)","j(4)","f(3)(4)","o(2)(1)","j","k(2)","k","x(4)","s(3)(4)","p(1)(3)","y","r(2)","i(3)(4)","j","p(4)(3)","e","j(4)","g(4)(2)","x","l","x","g","w","o","t(2)(4)","s","f","o","h","h(2)(4)","z(4)(2)","w","l","n","q","w","l","a","o","v","h","b","v","b","k","x(2)","r(2)(1)","g(2)","c(4)(3)","w(1)","g(4)","z","i(3)(2)","r","e","p","z(4)(2)","s","c(1)","h","l","j(3)(4)","x(1)(2)","a","b","t","c"};
        System.out.println(Arrays.toString(new Test1().getFolderNames(s)));
    }
    public String[] getFolderNames(String[] names) {
        String[] ans = new String[names.length];

        Map<String,Integer> map = new HashMap<>();

        for (int i=0; i<names.length; i++) {
            String temp = names[i];
            int j = map.getOrDefault(temp, 1);
            while (map.containsKey(temp)) {
                temp = names[i] + "(" + (j++) + ")";
            }

            map.put(temp, 1);
            map.put(names[i], j);
            ans[i] = temp;
        }
        return ans;
    }
}
