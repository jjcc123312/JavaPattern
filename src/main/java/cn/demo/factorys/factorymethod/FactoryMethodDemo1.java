package main.java.cn.demo.factorys.factorymethod;

/**
 * Create by Jjcc on 2019/7/2 18:53
 *
 * @author Jjcc
 */
public class FactoryMethodDemo1 {
    public static void main(String[] args){
        Phone1 phone = new AppleFactory1().createPhone();
        phone.call();
    }

}

/**
 * 手机类
 */
interface Phone1 {
    void call();
}

/**
 * 安卓手机
 */
class Android1 implements Phone1 {
    @Override
    public void call() {
        System.out.println("Android手机");
    }
}

/**
 * 苹果手机
 */
class Apple1 implements Phone1 {
    @Override
    public void call() {
        System.out.println("Apple手机");
    }
}

/**
 * 创建手机类的接口
 */
interface PhoneFactory1 {
    Phone1 createPhone();
}

/**
 * 安卓手机实例创建工厂
 */
class AndroidFactory1 implements PhoneFactory1 {
    @Override
    public Phone1 createPhone() {
        return new Android1();
    }
}

/**
 * 苹果手机实例创建工厂
 */
class AppleFactory1 implements PhoneFactory1 {
    @Override
    public Phone1 createPhone() {
        return new Apple1();
    }
}




