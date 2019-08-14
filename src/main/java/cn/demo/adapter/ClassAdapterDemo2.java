package main.java.cn.demo.adapter;

/**
 * 类适配器模式
 * Create by Jjcc on 2019/7/9 18:43
 *
 * @author Jjcc
 */
public class ClassAdapterDemo2 {
    public static void main(String[] args){
        ITarget3 adapter3 = new Adapter3();
        test(adapter3);
    }

    private static void test(ITarget3 target) {
        target.method1();
        target.method2();
    }


}

/**
 * 需要被适配的类;源
 */
class Adaptee3 {
    public void method1() {
        System.out.println("method 1");
    }

}

/**
 * 目标
 */
interface ITarget3 {
    void method1();
    void method2();
}

/**
 * 适配器
 */
class Adapter3 extends Adaptee3 implements ITarget3 {
    @Override
    public void method2() {
        System.out.println("method 2");
    }
}








