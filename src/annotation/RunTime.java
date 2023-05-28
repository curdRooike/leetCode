package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 查看当前方法运行时间
 * @date 2023/5/24 09:46:01
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RunTime {
    String value() default "ms";
}
