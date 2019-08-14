package main.java.cn.demo.singletions;

/**
 * 单例懒汉式
 * Create by Jjcc on 2019/6/27 23:05
 *
 * @author Jjcc
 */
public class SingletonDemo2 {

    private static SingletonDemo2 sd = null;

    /**
     * 构造方法私有化
     */
    private SingletonDemo2(){}

    /**
     * 线程安全了,效率较低;不调用该方法时,不会初始化
     * @return
     */
    public static synchronized SingletonDemo2 getInstance() {
        if (sd == null) {
            sd = new SingletonDemo2();
        }
        return sd;
    }


    public static class Test {
        public static void main(String[] args){

        }
    }
}


