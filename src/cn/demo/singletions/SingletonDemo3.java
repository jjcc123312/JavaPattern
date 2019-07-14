package cn.demo.singletions;

/**
 * 双重检测锁
 * Create by Jjcc on 2019/6/27 23:28
 *
 * @author Jjcc
 */
public class SingletonDemo3 {

    private static volatile SingletonDemo3 sd = null;

    private SingletonDemo3() {}

    public static SingletonDemo3 getInstance() {
        if (sd == null) {
            //增加同步块
            synchronized (SingletonDemo3.class) {
                if (sd == null) {
                    sd = new SingletonDemo3();
                }
            }
        }
        return sd;
    }

    public static void main(String[] args){
        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                SingletonDemo3 instance = SingletonDemo3.getInstance();
                System.out.println(Thread.currentThread().getName() + instance.hashCode());
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                SingletonDemo3 instance = SingletonDemo3.getInstance();
                System.out.println(Thread.currentThread().getName() + instance.hashCode());
            }
        }).start();
    }
}
