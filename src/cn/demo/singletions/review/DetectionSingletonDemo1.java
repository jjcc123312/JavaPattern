package cn.demo.singletions.review;

/**
 * 单例模式-双重检测锁；
 * 线程安全的；使用了同步锁，调用效率低；实现了延迟加载；因为JVM优化机制，非原子性操作可能会出现指令重排导致出现空指针的情况
 * Create by Jjcc on 2019/7/10 20:58
 *
 * @author Jjcc
 */
public class DetectionSingletonDemo1 {

    /**
     * volatile：在他完成赋值之前，不会进行读的操作
     */
    private static volatile DetectionSingletonDemo1 dsd = null;

    private DetectionSingletonDemo1() {

    }

    public static DetectionSingletonDemo1 getInstance() {
        if (null == dsd) {
            //同步方法快
            synchronized (DetectionSingletonDemo1.class) {
                if (null == dsd) {
                    //非原子性操作
                    dsd = new DetectionSingletonDemo1();
                }
            }
        }
        return dsd;
    }
}
