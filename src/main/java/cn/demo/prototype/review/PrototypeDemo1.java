package main.java.cn.demo.prototype.review;

import java.io.*;

/**
 * 原型模式
 * 通过new产生一个对象需要非常繁琐的数据准备或者访问权限，则可以使用原型模式；
 * 通过实现Cloneable接口，重写clone()方法实现克隆；
 * clone()方法不会调用constructor方法；
 * Object的clone()方法是一个本地方法,直接操作二进制文件，效率高；
 * @author Jjcc
 * @version 1.0.0
 * @Description
 * @ClassName PrototypeDemo1.java
 * @createTime 2019年07月14日 23:05:00
 */
public class PrototypeDemo1 {
    public static void main(String[] args) {
        /* 完全克隆，通过反序列化来实现 */
        Person person = new Person();
        person.setName("Jjcc");
        person.setSex("men");
        System.out.println(person.hashCode());

        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);
             ) {
            oos.writeObject(person);

            try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                 ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream);
                 ) {
                Object o = ois.readObject();
                System.out.println(o.hashCode());

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        /*Person person = new Person();
        person.setName("Jjcc");
        person.setSex("men");

        Person person1 = person;

        System.out.println(person);
        System.out.println(person1);

        person1.setSex("women");

        System.out.println("---------------");
        System.out.println(person);
        System.out.println(person1);*/

//        Person personClone = (Person) person.clone();
//
//        System.out.println(person == personClone);
    }
}

class Person implements Cloneable,Serializable {
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person() {
        System.out.println("执行了构造方法！");
    }

    /**
     * 重写Object的clone()方法；
     * clone()方法是本地方法，操作的是二进制文件，效率很快，且不会执行对象构造方法；
     * @Description:
     * @author: Jjcc
     * @title: clone
     * @param: []
     * @return: java.lang.Object
     * @createTime: 2019/7/14 23:19
     * @throws: CloneNotSupportedException
     */
    @Override
    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}



