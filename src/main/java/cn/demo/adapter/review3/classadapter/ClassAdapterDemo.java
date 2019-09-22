package cn.demo.adapter.review3.classadapter;

/**
 * 适配器模式：把一个类的接口变换成客户所期待的另一种接口，从而使原本因为接口不兼容而无法一起工作的两个类可以一起工作；
 *      源 adaptee：
 *      目标 target：
 *      适配器 adapter：
 * 类适配器模式：适配器类继承源类，获取源类的所有方法，并实现Target接口
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Client.java
 * @createTime 2019年09月22日 21:20:00
 */
public class ClassAdapterDemo {
    public static void main(String[] args){
        method(new Adapter());
    }

    public static void method(Target target) {
        target.method();
    }


}

/**
 * 源
 */
class Aadptee {

    public void method() {
        System.out.println("method！");
    }

}

/**
 * 目标
 */
interface Target {

    void method();
}

/**
 * 适配器类
 */
class Adapter extends Aadptee implements Target {
    //这里不须要重写接口中的方法；如果父类中的方法和接口中的方法方法名与参数一致，父类中的方法相当于重写了接口中的方法
}

