package aspect;

import annotation.RunTime;

import javax.management.MBeanServer;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.lang.management.ThreadMXBean;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 查看当前方法运行时间切面类
 * @date 2023/5/24 09:47:12
 */
public class  RunTimeHandler implements InvocationHandler {
    private Object target;

    public RunTimeHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage heapMemoryUsage = memoryMXBean.getHeapMemoryUsage();
        long usedHeapMemory = heapMemoryUsage.getUsed();
        long startTime = System.currentTimeMillis();
        Object result = method.invoke(target, args);
        long endTime = System.currentTimeMillis();

        RunTime annotation = method.getAnnotation(RunTime.class);
        String unit = annotation.value();
        long duration = endTime - startTime;
        if (unit.equals("ms")) {
            System.out.println("Method " + method.getName() + " took " + duration + " milliseconds to run.");
        } else if (unit.equals("s")) {
            System.out.println("Method " + method.getName() + " took " + (duration / 1000.0) + " seconds to run.");
        }
        MemoryMXBean memoryMXBean1 = ManagementFactory.getMemoryMXBean();
        MemoryUsage heapMemoryUsage1 = memoryMXBean1.getHeapMemoryUsage();
        System.out.println(heapMemoryUsage);
        System.out.println(heapMemoryUsage1);
        long usedHeapMemory1 = heapMemoryUsage1.getUsed();
        System.out.println("Used heap memory: " + (usedHeapMemory1 - usedHeapMemory)/(1024 * 1024 ) + " mb");
        return result;
    }
}
