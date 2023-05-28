package week36;

import aspect.RunTimeHandler;

import java.lang.reflect.Proxy;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description
 * @date 2023/5/24 10:58:25
 */
public class Main {
    public static void main(String[] args) {
        MyClassImpl obj = new MyClassImpl();
        RunTimeHandler handler = new RunTimeHandler(obj);
        MyClass proxy = (MyClass) Proxy.newProxyInstance(
                MyClass.class.getClassLoader(),
                new Class[] { MyClass.class },
                handler);
        System.out.println(proxy.findAnagrams("abab", "ab"));
    }
}
