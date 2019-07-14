package cn.demo.singletions.review;

/**
 * 单例-饿汉式
 * 线程安全的，不能延迟加载；类加载阶段就会创建对象，导致不必要的消耗。
 * Create by Jjcc on 2019/7/9 23:28
 *
 * @author Jjcc
 */
public class EagerSingletonDemo1 {
    /**
     * 对于静态字段，类加载器在链接中的准备阶段就已经分配内存，初始化默认值；
     * new对象会在类加载的初始化阶段赋值；
     */
    private static EagerSingletonDemo1 esd = new EagerSingletonDemo1();

    /**
     * 私有化构造器，使之无法被创建对象
     */
    private EagerSingletonDemo1(){
        if (null != esd) {
            throw  new RuntimeException("对象已创建！");
        }
    }

    public static EagerSingletonDemo1 getInstance() {
        return esd;
    }
}

