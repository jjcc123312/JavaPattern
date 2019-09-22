package cn.demo.singletions.review2;

/**
 * 静态内部类：线程安全的，调用效率高，实现了延时加载
 * 使用了static，final修饰，保证了内存中只会有一个对象，是不能被改变的。类加载机制保证了被static修饰的变量是线程安全的；
 * 同时，静态内部类中的SICS成员变量如果不会调用，该类就不会被类装载，从而实现了延时加载；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className StaticInnerClassSingleton.java
 * @createTime 2019年09月19日 22:45:00
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
        System.out.println("1111111");
    }

    private static class StaticInnerClassSingleton1 {

        /**
         * static：在链接的准备阶段就会被分配内存空间并初始化默认值；
         *         在初始化阶段就会实例对象。并且类加载是线程安全的，虚拟机只会加载一次类；
         * final：第一次赋值之后不会在改变；
         */
        private static final StaticInnerClassSingleton SICS = new StaticInnerClassSingleton();

        static {
            System.out.println("222222");
        }
    }

    public static StaticInnerClassSingleton getInstance() {
        return StaticInnerClassSingleton1.SICS;
    }
}
