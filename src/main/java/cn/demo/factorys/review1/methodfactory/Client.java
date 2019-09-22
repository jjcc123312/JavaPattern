package cn.demo.factorys.review1.methodfactory;

/**
 * 工厂方法：定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使得一个类的实例化延时到了子类；
 *      用于生产一个产品等级结构中的固定产品；
 * 模式要素：
 *      产品类接口：定义一个所有产品共同的父类；
 *      工厂类接口：定义一个用于创建实例的方法；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Client.java
 * @createTime 2019年09月22日 15:16:00
 */
public class Client {
    public static void main(String[] args){
        HwPhoneFactory hwPhoneFactory = new HwPhoneFactory();

        Phone instance = hwPhoneFactory.getInstance();
        instance.method();
    }
}
