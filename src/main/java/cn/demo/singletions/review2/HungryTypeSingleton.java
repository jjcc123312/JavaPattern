package cn.demo.singletions.review2;

import java.io.Serializable;

/**
 * 单例模式：属于创建型模式，保证一个类只有一个实例，并且提供一个访问该实例的全局访问点；
 * 饿汉式：线程安全的，调用效率高，不能实现延时加载
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className HungryType.java
 * @createTime 2019年09月19日 21:31:00
 */
public class HungryTypeSingleton implements Serializable {

    private static final HungryTypeSingleton hungryType = new HungryTypeSingleton();

    /**
     * 构造方法私有化
     */
    private HungryTypeSingleton() {
        if (null != hungryType) {
            throw new RuntimeException("实例已经创建");
        }
    }

    public static HungryTypeSingleton getInstance() {
        return hungryType;
    }

    /**
     * 重写readResolver方法，防止反序列化创建对象；
     * @title readResolve
     * @description
     * @author Jjcc
     * @return java.lang.Object
     * @createTime 2019/9/19 21:40
     * @throws
     */
    public Object readResolve() {
        return hungryType;
    }

    public void method() {
        System.out.println("方法！！！");
    }
}


