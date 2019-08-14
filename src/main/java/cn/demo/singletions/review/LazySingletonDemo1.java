package cn.demo.singletions.review;


import java.io.Serializable;

/**
 * 单例-懒汉式
 * 线程安全的；因为使用了同步锁，调用效率较低；实现了延迟加载
 * Create by Jjcc on 2019/7/9 23:36
 *
 * @author Jjcc
 */
public class LazySingletonDemo1 implements Serializable {
    /**
     * 类加载阶段不会进行初始化
     */
    private static LazySingletonDemo1 lsd = null;

    /**
     * 构造器私有化
     */
    private LazySingletonDemo1() {
        if (null != lsd) {
            throw new RuntimeException("对象已经创建了！");
        }
    }

    public synchronized static LazySingletonDemo1 getInstance() {
        if (null == lsd) {
            lsd = new LazySingletonDemo1();
        }
        return lsd;
    }

    /**
     * 该方法可以防止反序列化创建多个实例的漏洞
     * 每次反序列化读取I/O流中对象时，readResolve()方法都会被调用
     * @return
     */
    public Object readResolve() {
        return lsd;
    }
}
