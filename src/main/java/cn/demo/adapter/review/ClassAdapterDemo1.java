package main.java.cn.demo.adapter.review;

/**
 * 适配器模式-类适配器；
 * 把一个类的接口变换成客户所期待的接口，从而使原本因接口不匹配而无法一起工作的两个类可以一起工作；
 * 三个角色：源；目标；适配器；
 * 源：需要适配器转换的对象或者类型
 * 目标：客户所期望的值；
 * 适配器：连接目标和源的中间对象；
 * 类适配器模式：适配器继承Adaptee（源类）并实现Target（目标接口）；
 * @author Jjcc
 * @version 1.0.0
 * @Description
 * @ClassName AdapterDemo1.java
 * @createTime 2019年07月15日 21:45:00
 */
public class ClassAdapterDemo1 {
    public static void main(String[] args){
        ITarget1 adapter = new Adapter1();

        test(adapter);
    }

    public static void test(ITarget1 target) {
        target.method1();
    }
}

/**
 * 源
 */
class Adaptee1 {
    /**
     * 方法一；
     * @Description:
     * @author: Jjcc
     * @title: method1
     * @param: []
     * @return: void
     * @createTime: 2019/7/15 21:54
     * @throws:
     */
    public void method1() {
        System.out.println("method 1");
    }

}

/**
 * 目标
 */
interface ITarget1 {
    /**
     * 目标接口所对应源类中的方法；
     * @Description:
     * @author: Jjcc
     * @title: method1
     * @param: []
     * @return: void
     * @createTime: 2019/7/15 22:03
     * @throws:
     */
    void method1();

}

/**
 * 适配器；
 * 如果实现类不重写接口中的方法，则把从父类中继承的方法（方法名相同，参数相同）当做接口方法的实现；
 * 接口的优先级高于父类
 */
class Adapter1 extends Adaptee1 implements ITarget1 {

}



