package cn.demo.singletions;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 饿汉式单例模式
 * Create by Jjcc on 2019/6/27 22:31
 *
 * @author Jjcc
 */
public class SingletonDemo1 {

    /**
     * 设置成静态变量,类在加载时,在链接的准备阶段就创建了
     */
    private static SingletonDemo1 sd = new SingletonDemo1();

    /**
     * 该类不能被创建实例对象
     */
    private SingletonDemo1() throws RuntimeException{
        if (null != sd) {
            throw new RuntimeException("只能创建一个对象!");
        }
    }

    public static SingletonDemo1 getInstance() {
        return sd;
    }

    public void getMethod() {
        System.out.println("!");
    }

    public static void main(String[] args){
        SingletonDemo1 instance = SingletonDemo1.getInstance();
        System.out.println(instance.hashCode());

        try {
            Class<?> c = Class.forName("cn.demo.singletions.SingletonDemo1");
            try {
                Constructor<?> dc = c.getDeclaredConstructor();
                SingletonDemo1 o = (SingletonDemo1) dc.newInstance();
                System.out.println(o.hashCode());

            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Test4 {
    public static void main(String[] args){
        SingletonDemo1 instance = SingletonDemo1.getInstance();
        System.out.println(instance.hashCode());
    }
}


