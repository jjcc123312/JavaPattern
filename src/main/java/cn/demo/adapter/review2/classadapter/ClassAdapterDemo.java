package cn.demo.adapter.review2.classadapter;

/**
 * Adapter适配器：使由于接口不兼容而无法一起工作的类可以一起工作；
 * 把一个类的接口变成客户端所期待的另一种接口，从而使原本因为接口不兼容而无法一起工作的两个类一起工作；
 * 三个角色：
 *      源（Adaptee）：需要适配的对象或类型；
 *      目标（Target）：客户端期待的目标；
 *      适配器（Adapter）：连接目标和源的中间对象；
 * 类适配器：适配器类（Adapter）继承源类（Adaptee）并实现实现目标接口（Target）
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className ClassAdapterDemo.java
 * @createTime 2019年09月07日 22:06:00
 */
public class ClassAdapterDemo {
    public static void main(String[] args) {
        ITarget adapter = new Adapter();

        method(adapter);

        method(() -> System.out.println("Method111!!!!"));
    }


    public static void method(ITarget target) {
        target.method1();
    }
}

/**
 * 目标接口
 */
@FunctionalInterface
interface ITarget {

    /**
     * 目标类中的方法1
     * @title method1
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/9/7 22:25
     * @throws
     */
    void method1();

    /**
     * 目标类中的方法1
     * @title method1
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/9/7 22:25
     * @throws
     */
    default void method2(){};
}

/**
 * 源类
 */
class Adaptee {

    public void method1() {
        System.out.println("method1！！！");
    }
}

/**
 * 适配器类；
 * 如果实现类中不重写接口中的抽象方法，恰巧父类中有相同的方法，则把父类中的方法当做抽象方法的重写
 */
class Adapter extends Adaptee implements ITarget {

    @Override
    public void method2() {
        System.out.println("method2！！！");
    }
}
