package main.java.cn.demo.adapter;

/**
 * 对象适配器模式
 * Create by Jjcc on 2019/7/9 18:50
 *
 * @author Jjcc
 */
public class ObjectAdapterDemo2 {
    public static void main(String[] args){
        Adaptee4 adaptee4 = new Adaptee4();
        ITarget4 adapter4 = new Adapter4(adaptee4);

        adapter4.method1();
        adapter4.method2();
    }
}

/**
 * 被适配的类;源
 */
class Adaptee4 {
    public void method1() {
        System.out.println("method 1");
    }
}

/**
 * 目标;客户端需要使用的接口
 */
interface ITarget4 {
    void method1();
    void method2();
}

/**
 * 适配器
 */
class Adapter4 implements ITarget4 {
    private Adaptee4 adaptee;

    @Override
    public void method1() {
        adaptee.method1();
    }

    @Override
    public void method2() {
        System.out.println("method 2");
    }

    public Adapter4(Adaptee4 adaptee) {
        this.adaptee = adaptee;
    }
}




