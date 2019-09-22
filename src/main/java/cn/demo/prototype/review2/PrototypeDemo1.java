package cn.demo.prototype.review2;

import java.io.Serializable;

/**
 * 原型模式：任何类想要支持克隆，必须实现Cloneable接口，重写clone()方法；
 *      clone()方法创建对象，不会调用constructor方法，clone()方法是一个本地方法，直接操作二进制文件，效率高；
 *      clone()对于对于基本数据类型及其包装类和String类型都自动实现了深克隆，直接复制的值；
 * 克隆模式的几种分类：
 *      浅克隆：实现Cloneable，重写clone()方法直接返回super.clone();对于基本数据类型及其包装类和String的变量会重新复制一份，而
 *              对于引用类型的变量（数组，类的对象等），只会拷贝变量对对象的引用，前后两个变量都是指向堆中的同一个对象；
 *      深克隆：不仅会对基本数据类型和String类型的值进行拷贝，同时对引用指向的对象进行拷贝（需要在clone()进行子对象的clone()操作），
 *      完全克隆：使用反序列化操作，创建一个对象，对基本数据类型和引用指向的对象也进行了拷贝；
 *              实现Serializable接口，然后将对象写进二进制流中，再从二进制流中读出新对象；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className PrototypeDemo.java
 * @createTime 2019年09月22日 17:27:00
 */
public class PrototypeDemo1 implements Cloneable, Serializable {

    private String name;

    private PrototypeDemo2 prototypeDemo2;

    private Integer prod;

    public PrototypeDemo1(String name, PrototypeDemo2 prototypeDemo2, Integer prod) {
        this.name = name;
        this.prototypeDemo2 = prototypeDemo2;
        this.prod = prod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PrototypeDemo2 getPrototypeDemo2() {
        return prototypeDemo2;
    }

    public void setPrototypeDemo2(PrototypeDemo2 prototypeDemo2) {
        this.prototypeDemo2 = prototypeDemo2;
    }

    public Integer getProd() {
        return prod;
    }

    public void setProd(Integer prod) {
        this.prod = prod;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PrototypeDemo1 clone = (PrototypeDemo1) super.clone();

//        clone.setPrototypeDemo2((PrototypeDemo2) clone.getPrototypeDemo2().clone());

        return clone;
    }

    @Override
    public String toString() {
        return "PrototypeDemo1{" +
                "name='" + name + '\'' +
                ", prototypeDemo2=" + prototypeDemo2 +
                ", prod=" + prod +
                '}';
    }
}

class PrototypeDemo2 implements Cloneable,Serializable {

    private Integer age;

    public PrototypeDemo2(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PrototypeDemo2{" +
                "age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
