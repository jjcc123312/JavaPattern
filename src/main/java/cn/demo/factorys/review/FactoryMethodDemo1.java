package cn.demo.factorys.review;


/**
 * 单例模式-工厂方法模式
 * 用于生产同一产品等级结构中的固定产品；
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类；
 * 提供一个产品类的接口；
 * 提供一个创建对象的工厂类接口；
 * Create by Jjcc on 2019/7/11 14:36
 *
 * @author Jjcc
 */
public class FactoryMethodDemo1 {

    public static void main(String[] args){
        BenzFactoryImpl benzFactory = new BenzFactoryImpl();
        AudiFactoryImpl audiFactory = new AudiFactoryImpl();
        BmwFactoryImpl bmwFactory = new BmwFactoryImpl();
        ITyre instance1 = benzFactory.getInstance();
        ITyre instance2 = audiFactory.getInstance();
        ITyre instance3 = bmwFactory.getInstance();

        instance1.call();
        instance2.call();
        instance3.call();
    }
}

/**
 * 产品接口；轮胎
 */
interface ITyre {
    /**
     * 速度
     */
    void call();
}
/**
 * 奔驰轮胎
 */
class BenzTyreImpl implements ITyre {
    @Override
    public void call() {
        System.out.println("奔驰轮胎！");
    }
}
/**
 * 奔驰轮胎
 */
class AudiTyreImpl implements ITyre {
    @Override
    public void call() {
        System.out.println("奥迪轮胎！");
    }

}
/**
 * 宝马轮胎
 */
class BmwTyreImpl implements ITyre {
    @Override
    public void call() {
        System.out.println("宝马轮胎！");
    }
}

/**
 * 创建实例的工厂接口
 */
interface IFactory {
   /**
    * 用于创建实例的方法
    *
    * @author: Jjcc
    * @title: getInstance
    * @param: []
    * @return: cn.demo.factorys.review.ITyre
    * @createTime: 2019/7/11 22:26
    * @throws
    */
    ITyre getInstance();
}

/**
 * 创建实例的工厂接口实现类
 */
class BenzFactoryImpl implements IFactory {
    @Override
    public ITyre getInstance() {
        return new BenzTyreImpl();
    }
}
class AudiFactoryImpl implements IFactory {
    @Override
    public ITyre getInstance() {
        return new AudiTyreImpl();
    }
}

class BmwFactoryImpl implements IFactory {
    @Override
    public ITyre getInstance() {
        return new BmwTyreImpl();
    }
}







