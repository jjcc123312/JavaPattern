package main.java.cn.demo.factorys.review;


/**
 * 工厂模式-抽象工厂模式；
 * 用来生产不同产品族的全部产品；对于新增产品无能为力，支持新增产品族；
 * 定义多个产品类的接口；
 * 定义一个用于创建产品族的工厂接口，接口中有多个用于创建不同实例对象的方法；
 * 让其子类决定实现各产品等级结构中的哪一个产品
 * @author Jjcc
 * @version 1.0.0
 * @className AbstractFactoryDemo1.java
 * @createTime 2019年07月11日 22:51:00
 */
public class AbstractFactoryDemo1 {
    public static void main(String[] args){
        ICarFactory1 benzCarFactory = new BenzCarFactory();
        IEngine1 engine = benzCarFactory.getEngine();
        ITyre1 tyre = benzCarFactory.getTyre();
        engine.brand();
        tyre.brand();
    }
}

/**
 * 轮胎产品的接口
 * @author Jjcc
 * @title ITyre1
 * @createTime: 2019/7/11 23:00
 */
interface ITyre1 {
    /**
     * 什么轮胎
     * @author Jjcc
     * @title brand
     * @param: []
     * @return void
     * @createTime: 2019/7/11 23:01
     * @throws: 
     */
    void brand();
}
/**
 * 引擎产品的接口
 * @author: Jjcc
 * @title: IEngine1
 * @createTime: 2019/7/11 23:04
 */
interface IEngine1 {
    /**
     * 什么引擎
     * @author: Jjcc
     * @title: brand
     * @param: []
     * @return: void
     * @createTime: 2019/7/11 23:04
     * @throws:
     */
    void brand();
}
/**
 * @Description: 座椅产品的接口
 * @author: Jjcc
 * @title: ISeat
 * @createTime: 2019/7/11 23:06
 */
interface ISeat {
    /**
     * 什么座椅
     * @Description:
     * @author: Jjcc
     * @title: brand
     * @param: []
     * @return: void
     * @createTime: 2019/7/11 23:06
     * @throws:
     */
    void brand();
}

/**
 * @Description: 奔驰引擎
 * @author: Jjcc
 * @title: BenzEngineImpl1
 * @createTime: 2019/7/11 23:09
 */
class BenzEngineImpl1 implements IEngine1{
    @Override
    public void brand() {
        System.out.println("奔驰引擎！");
    }
}
/**
 * @Description: 奥迪引擎
 * @author: Jjcc
 * @title: AudiEngineImpl1
 * @createTime: 2019/7/11 23:09
 */
class AudiEngineImpl1 implements IEngine1{
    @Override
    public void brand() {
        System.out.println("奥迪引擎！");
    }
}

/**
 * @Description: 奔驰轮胎
 * @author: Jjcc
 * @title: BenzTyreImpl1
 * @createTime: 2019/7/11 23:11
 */
class BenzTyreImpl1 implements ITyre1 {
    @Override
    public void brand() {
        System.out.println("奔驰轮胎！");
    }
}
/**
 * @Description: 奥迪轮胎
 * @author: Jjcc
 * @title: AudiTyreImpl1
 * @createTime: 2019/7/11 23:11
 */
class AudiTyreImpl1 implements ITyre {
    @Override
    public void call() {
        System.out.println("奥迪轮胎！");
    }
}

/**
 * @Description: 用于创建产品族的工厂接口
 * @author: Jjcc
 * @title: ICarFactor
 * @createTime: 2019/7/11 23:16
 */
interface ICarFactory1 {
    /**
     * 选择引擎产品等级结构的哪一个产品
     * @Description:
     * @author: Jjcc
     * @title: getEngine
     * @param: []
     * @return: main.java.cn.demo.factorys.review.IEngine1
     * @createTime: 2019/7/11 23:19
     * @throws:
     */
    IEngine1 getEngine();

    /**
     * 选择轮胎产品等级结构的哪一个产品
     * @Description:
     * @author: Jjcc
     * @title: getTyre
     * @param: []
     * @return: main.java.cn.demo.factorys.review.ITyre1
     * @createTime: 2019/7/11 23:21
     * @throws:
     */
    ITyre1 getTyre();
}

/**
 * 奔驰车产品族
 */
class BenzCarFactory implements ICarFactory1 {
    @Override
    public IEngine1 getEngine() {
        return new BenzEngineImpl1();
    }

    @Override
    public ITyre1 getTyre() {
        return new BenzTyreImpl1();
    }
}

