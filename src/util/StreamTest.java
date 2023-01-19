package util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description Stream流测试
 * @date 2023/1/18 21:09:03
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> collect = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
        System.out.println(collect);
    }

}
