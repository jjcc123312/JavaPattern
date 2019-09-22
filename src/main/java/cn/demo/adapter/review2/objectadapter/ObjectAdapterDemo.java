package cn.demo.adapter.review2.objectadapter;


/**
 * Adapter：使原本因为接口不兼容而无法一起工作的两个类可以一起工作；
 *          把一个类的接口变成客户端所期待的另一种接口；
 * 三种角色：
 *      源（Adaptee）：需要适配的对象或类型；
 *      目标（Target）：客户端所期待的目标；
 *      适配器（Adapter）:连接源和目标的中间对象；
 * 对象适配器：不使用继承，在Adapter中封装Adaptee，这里Adapter和Adaptee是组合关系
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className ObjectAdapterDemo.java
 * @createTime 2019年09月07日 22:37:00
 */
public class ObjectAdapterDemo {
    public static void main(String[] args){
        ITarget adapter = new Adapter(new Adaptee());

        method(adapter);
    }

    public static void method(ITarget target) {
        target.mehtod1();
        target.method2();
    }
}

/**
 * 目标接口
 */
interface ITarget {
    void mehtod1();

    void method2();
}

/**
 * 源
 */
class Adaptee {

    public void mehtod1() {
        System.out.println("method1!!!");
    }

    public void method2() {
        System.out.println("method2!!!");
    }
}

/**
 * 适配器
 */
class Adapter implements ITarget {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void mehtod1() {
        adaptee.mehtod1();
    }

    @Override
    public void method2() {
        adaptee.method2();
    }
}