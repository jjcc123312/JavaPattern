package cn.demo.factorys.factorymethod;

/**
 * 工厂方法模式
 * Create by Jjcc on 2019/7/4 15:09
 *
 * @author Jjcc
 */
public class FactoryMethodDemo2 {

    public static void main(String[] args){
        ICar instance = new BenzFactoryImpl().createInstance();
        instance.run();
        instance.start();
    }
}

interface ICar {
    /**
     * 速度
     */
    void run();

    /**
     * 初始速度
     */
    void start();
}

class BenzImpl implements ICar {

    @Override
    public void run() {
        System.out.println("快快快!");
    }

    @Override
    public void start() {
        System.out.println("起始速度快快快!");
    }
}

interface IFactory {
    /**
     * 创建产品实例对象的方法
     * @return
     */
    ICar createInstance();
}

class BenzFactoryImpl implements IFactory {
    @Override
    public ICar createInstance() {
        return new BenzImpl();
    }
}


