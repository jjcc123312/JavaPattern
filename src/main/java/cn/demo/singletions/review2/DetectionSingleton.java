package cn.demo.singletions.review2;

/**
 * 双重检测锁：线程安全的，调用效率低（使用了同步锁synchronized），JVM机制问题可能会出现指令重排操作导致出线空指针；
 * volatile：修饰的变量在写的操作完成前，不会进行读的操作，并且禁止了指令重排；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className DetectionSingleton.java
 * @createTime 2019年09月19日 22:38:00
 */
public class DetectionSingleton {

    private volatile static DetectionSingleton detectionSingleton = null;

    private DetectionSingleton() {

    }

    public static DetectionSingleton getInstance() {
        if (null == detectionSingleton) {
            synchronized (DetectionSingleton.class) {
                if (null == detectionSingleton) {
                    detectionSingleton = new DetectionSingleton();
                }
            }
        }


        return detectionSingleton;
    }
}
