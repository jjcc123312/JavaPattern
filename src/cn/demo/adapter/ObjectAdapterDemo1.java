package cn.demo.adapter;

import java.util.Date;

/**
 * 对象适配器
 * Create by Jjcc on 2019/7/8 23:12
 *
 * @author Jjcc
 */
public class ObjectAdapterDemo1 {
    public static void main(String[] args){

        Adaptee2 adaptee2 = new Adaptee2();
        ITarget2 adapter2 = new Adapter2(adaptee2);

        test(adapter2);
    }

    public static void test(ITarget2 adapter2) {
        adapter2.method1();
        adapter2.mehtod2();
    }


}

/**
 * 目标
 */
interface ITarget2 {
    void method1();
    void mehtod2();
}

/**
 * 需要被适配的对象或类
 */
class Adaptee2 {
    public void method1() {
        System.out.println("method 1");
    }
}

/**
 * 适配器
 */
class Adapter2 implements ITarget2 {

    private Adaptee2 adaptee;

    @Override
    public void mehtod2() {
        System.out.println("method 2");
    }

    public Adapter2(Adaptee2 adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method1() {
        adaptee.method1();
    }
}