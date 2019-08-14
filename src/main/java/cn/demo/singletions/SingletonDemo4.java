package main.java.cn.demo.singletions;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例-静态内部类
 * Create by Jjcc on 2019/6/30 10:40
 *
 * @author Jjcc
 */
public class SingletonDemo4 {

    /**
     * 构造方法私有化,该类无法被实例化
     */
    private SingletonDemo4(){
//        if (null != SingletonHolder.SD) {
//            throw new RuntimeException("只能创建一个对象");
//        }
    }

    /**
     * 内部类采用饿汉式写法,在内部类初始化时会由ClassLoader保证同步
     * final修饰,实例在编译阶段就会分配内存空间,初始化值,只能被赋值一次
     */
    private static class SingletonHolder {
        private static final SingletonDemo4 SD = new SingletonDemo4();
    }

    /**
     * 外部类没有static属性，则不会像饿汉式那样立即加载对象。
     * @return
     */
    public static final SingletonDemo4 getInstance() {
        return SingletonHolder.SD;
    }

    public void getMethod() {
        System.out.println("!!!!!!!!!!!!");
    }


    public static void main(String[] args){
        SingletonDemo4 instance = SingletonDemo4.getInstance();
        System.out.println(instance.hashCode());

        try {
            Class<?> aClass = Class.forName("main.java.cn.demo.singletions.SingletonDemo4");
            try {
                Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
                SingletonDemo4 o = (SingletonDemo4) declaredConstructor.newInstance();
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
