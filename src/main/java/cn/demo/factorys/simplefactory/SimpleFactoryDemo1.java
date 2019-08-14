package cn.demo.factorys.simplefactory;

/**
 * 简单工厂模式
 * Create by Jjcc on 2019/6/30 22:24
 *
 * @author Jjcc
 */
public class SimpleFactoryDemo1 {

    public static void main(String[] args){
        SimpleFactory simpleFactory = new SimpleFactory();
        Phone phone = simpleFactory.getPhone("apple");
        phone.call();
    }
}

/**
 * 手机接口
 */
interface Phone {
    void call();
}

/**
 * 苹果手机
 */
class Apple implements Phone {
    @Override
    public void call() {
        System.out.println("苹果手机");
    }
}

/**
 * 安卓手机
 */
class Android implements Phone {
    @Override
    public void call() {
        System.out.println("安卓手机");
    }
}

class SimpleFactory {

    public Phone getPhone(String phoneType) {
        Phone p = null;
        switch (phoneType) {
            case "apple":
                p = new Apple();
                break;
            case "android":
                p = new Android();
                break;
            default:
        }
        return p;
    }

}