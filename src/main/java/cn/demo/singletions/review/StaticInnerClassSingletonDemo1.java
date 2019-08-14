package cn.demo.singletions.review;

/**
 * 单例模式-静态内部类
 * 线程安全的；调用效率高；实现了延时加载；
 * Create by Jjcc on 2019/7/10 21:25
 *
 * @author Jjcc
 */
public class StaticInnerClassSingletonDemo1 {

    private StaticInnerClassSingletonDemo1() {
        if (null != StaticInnerClass.SICSD) {
            throw new RuntimeException("对象已存在！");
        }
    }

    /**
     * 静态内部类；
     */
    private static class StaticInnerClass {
        /**
         * final static修饰的，保证了内存中只有这样一个实例；
         * final修饰：值不会改变；
         * static修饰：实例只会初始化一次，ClassLoader机制一个类只会加载一次；
         */
        private final static StaticInnerClassSingletonDemo1 SICSD = new StaticInnerClassSingletonDemo1();

        /**
         * SICSD虽然使用了final修饰，但是常量池中只能引用到基本数据类型和String类型的字面量，所以该内部类还是会初始化
         * 初始化：执行类构造器：static变量与static域
         */
        static {
            System.out.println("ok");
        }
    }

    public static StaticInnerClassSingletonDemo1 getInstance() {
        return StaticInnerClass.SICSD;
    }
}
