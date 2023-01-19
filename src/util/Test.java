package util;

import java.io.UnsupportedEncodingException;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 测试类
 * @date 2022/11/27 01:21:09
 */
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
       /* String a = "古";
        System.out.println("UTF-8编码长度:"+a.getBytes("UTF-8").length);
        System.out.println("GBK编码长度:"+a.getBytes("GBK").length);
        System.out.println("GB2312编码长度:"+a.getBytes("GB2312").length);
        System.out.println("==========================================");
        String c = "c";
        System.out.println("UTF-8编码长度:"+c.getBytes("UTF-8").length);
        System.out.println("GBK编码长度:"+c.getBytes("GBK").length);
        System.out.println("GB2312编码长度:"+c.getBytes("GB2312").length);
        System.out.println("==========================================");

        char[] arr = Character.toChars(0x20001);
        String s = new String(arr);
        System.out.println("char array length:" + arr.length);
        System.out.println("content:|  " + s + " |");
        System.out.println("String length:" + s.length());
        System.out.println("UTF-8编码长度:"+s.getBytes("UTF-8").length);
        System.out.println("GBK编码长度:"+s.getBytes("GBK").length);
        System.out.println("GB2312编码长度:"+s.getBytes("GB2312").length);
        System.out.println("==========================================");

        String sss = "我喜欢你饕餮";
        System.out.println(sss.length());*/

        double c = 5.5;
        double c1 = 5.4;
        int a = (int) c;
        int a1 = (int) c1;
        float c2 = a1;
        System.out.println(a);
        System.out.println(a1);
    }
}
