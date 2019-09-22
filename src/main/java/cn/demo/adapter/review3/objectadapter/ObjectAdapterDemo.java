package cn.demo.adapter.review3.objectadapter;

/**
 * 对象类适配器：不使用继承，在Adapter类中封装Adaptee, 这里Adaptee和Adapter是组合关系
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className ObjectAdapterDemo.java
 * @createTime 2019年09月22日 21:38:00
 */
public class ObjectAdapterDemo {
    public static void main(String[] args){

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
class Adapter implements Target {

    private Aadptee adaptee;

    public Adapter(Aadptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method() {
        adaptee.method();
    }
}