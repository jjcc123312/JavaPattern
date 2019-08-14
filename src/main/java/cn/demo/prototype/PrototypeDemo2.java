package main.java.cn.demo.prototype;


import java.io.*;

/**
 * Create by Jjcc on 2019/7/5 16:41
 *
 * @author Jjcc
 */
public class PrototypeDemo2 {
    public static void main(String[] args){
        IPerson yellow1 = PersonFactory.createInstance("yellow");
        IPerson yellow2 = PersonFactory.createInstance("yellow");
        System.out.println(yellow1 == yellow2);


        /**
         * 通过序列化,反序列化实现对象克隆
         */
        Car car = new Car();
        car.setType("11");
        car.setName("Benz");
        try (ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(arrayOutputStream);
             ) {
            objectOutputStream.writeObject(car);

            byte[] bytes = arrayOutputStream.toByteArray();

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

            Car car1 = (Car) objectInputStream.readObject();

            System.out.println(car1);

            objectInputStream.close();
            byteArrayInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}

class Car implements Serializable {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}


interface IPerson {
    /**
     * 肤色
     * @return
     */
    void color();
}

class YellowPersonImpl implements IPerson,Cloneable {


    public YellowPersonImpl() {
        System.out.println("执行构造方法!");
    }

    @Override
    public void color() {
        System.out.println("黄皮肤的");
    }

    @Override
    protected Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}

class WhitePersonImpl implements IPerson,Cloneable {

    @Override
    public void color() {
        System.out.println("白皮肤的");
    }
}

/**
 * 简单工厂模式与克隆模式
 */
class PersonFactory {
    static YellowPersonImpl ypi = null;

    public static IPerson createInstance(String type) {
        IPerson person = null;
        switch (type) {
            case "yellow" :
                if (ypi == null) {
                    ypi = new YellowPersonImpl();
                    person = ypi;
                } else {
                    YellowPersonImpl clone = (YellowPersonImpl) ypi.clone();
                    person = clone;
                }
                break;
            case "white":
                person = new WhitePersonImpl();
                break;
            default:
        }

        return person;
    }
}
