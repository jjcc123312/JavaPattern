package main.java.cn.demo.adapter.review;

/**
 * 适配器-对象适配器；
 * 把一个类变换成客户端所期待的另一种类型，从而使原文因为接口不兼容的两种类可以一起工作；
 * 对象适配器：不使用继承，但把源类封装进适配器中，这里Adaptee与Adapter是组合关系；
 * @author Jjcc
 * @version 1.0.0
 * @Description
 * @ClassName ObjectAdapterDemo1.java
 * @createTime 2019年07月15日 22:11:00
 */
public class ObjectAdapterDemo1 {
    public static void main(String[] args){
        ITarget2 adapter2 = new Adapter2(new Adaptee2());
        adapter2.method1();
    }
}

/**
 * 源
 */
class Adaptee2 {

    public void method1() {
        System.out.println("method 1");
    }
}

/**
 * 目标；
 */
interface ITarget2 {

    /**
     * 目标接口中与源类的方法名，参数，返回类型都相同；
     * @Description:
     * @author: Jjcc
     * @title: method1
     * @param: []
     * @return: void
     * @createTime: 2019/7/15 22:18
     * @throws:
     */
     void method1();
}

class Adapter2 implements ITarget2 {

    private Adaptee2 adaptee;

    public Adapter2(Adaptee2 adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method1() {
        adaptee.method1();
    }
}

