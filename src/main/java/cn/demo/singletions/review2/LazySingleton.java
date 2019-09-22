package cn.demo.singletions.review2;



/**
 * 懒汉式：线程安全的，调用效率低（使用了同步锁），实现了延时加载
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className LazySingleton.java
 * @createTime 2019年09月19日 22:24:00
 */
public class LazySingleton {

    private  static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public synchronized static LazySingleton getInstance() {
        if (null == lazySingleton) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
