package cn.demo.adapter;

/**
 * 接口类适配器
 * Create by Jjcc on 2019/7/9 21:26
 *
 * @author Jjcc
 */
public class InterfaceAdapterDemo1 {

    public static void main(String[] args){
        test(new BaseAdapter5() {
            @Override
            public void method2() {
                System.out.println("method 2");
            }
        });
    }

    public static void test(BaseAdapter5 ba) {
        ba.method1();
    }
}

/**
 * 被适配的类;源
 */
class Adaptee5 {
    public void method1() {
        System.out.println("method 1");
    }
}

/**
 * 接口；客户所期待的接口类型
 */
interface ITarget5 {
    void method1();
    void method2();
}

/**
 * 适配器；定义抽象类实现端口接口，但是什么事情都不做；
 * 这里抽象类BaseAdapter5继承了Adaptee5，Adaptee5的方法method1()相当于是重写了接口ITarget5的抽象方法method1()；
 */
abstract class BaseAdapter5 extends Adaptee5 implements ITarget5{
    @Override
    public void method2() {

    }
}

/**
 * 基类的子类；需要什么方法就重写什么方法
 */
class MethodOne extends BaseAdapter5 {
    @Override
    public void method2() {
        System.out.println("method 2");
    }
}