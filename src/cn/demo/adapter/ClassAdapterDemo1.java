package cn.demo.adapter;

/**
 * adapter-类适配器
 * Create by Jjcc on 2019/7/8 21:36
 *
 * @author Jjcc
 */
public class ClassAdapterDemo1 {

    public static void main(String[] args){
        Adapter adapter = new Adapter();
        test(adapter);
    }

    public static void test(ITarget adapter) {
        adapter.method1();
        adapter.method2();
    }
}

/**
 * 期待得到的目标
 */
interface ITarget {

    /**
     * 方法1
     */
    void method1();

    /**
     * 方法2
     */
    void method2();
}

/**
 * 需要被适配的对象或类型(源)
 */
class Adaptee {
    /**
     * 方法1
     */
    public void method1(){
        System.out.println("method 1");
    }
}

/**
 * 适配器
 */
class Adapter extends Adaptee implements ITarget {
    @Override
    public void method2() {
        System.out.println("method 2");
    }


}







