package main.java.cn.demo.factorys.review;

/**
 * 工厂模式-简单工厂模式;
 * 用来生产同一等级结构中的任意产品；对于增加新的产品需要修改代码；
 * 通过专门定义一个类来负责创建其它类的实例，被创建的实例通常都有共同的父类。
 * Create by Jjcc on 2019/7/10 23:32
 * @author Jjcc
 */
public class SimpleFactoryDemo1 {

    public static void main(String[] args){
        IEngine benz = SimpleFactory.getEngine("benz");
        benz.call();
        int i = 1;
        System.out.println();
    }
}

/**
 * 产品接口;
 * 一个产品等级结构；
 */
interface IEngine {
    /**
     * 速度
     */
    void call();
}

/**
 * 具体产品
 */
class BenzEngineImpl implements IEngine {
    @Override
    public void call() {
        System.out.println("奔驰引擎速度非常快！");
    }
}
class AudiEngineImpl implements IEngine {
    @Override
    public void call() {
        System.out.println("奥迪引擎速度比较快！");
    }
}

/**
 * 用于创建实现类和选择实现类的工厂
 */
class SimpleFactory {

    private SimpleFactory() {

    }

    public static IEngine getEngine(String type) {
        IEngine instance = null;
        switch (type) {
            case "benz":
                instance = new BenzEngineImpl();
                break;
            case "audi":
                instance = new AudiEngineImpl();
                break;
                default:
        }
        return instance;
    }
}
