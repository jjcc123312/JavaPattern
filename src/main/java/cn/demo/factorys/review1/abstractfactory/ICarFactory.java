package cn.demo.factorys.review1.abstractfactory;

/**
 * 用于创建产品族的接口
 * 接口中定义多个用于创建不同产品等级结构的产品对象的方法
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className ICarFactory.java
 * @createTime 2019年09月22日 16:47:00
 */
public interface ICarFactory {

    /**
     * 用于创建轮胎产品等级结构的产品实例
     * @title getTyre
     * @description
     * @author Jjcc
     * @return cn.demo.factorys.review1.abstractfactory.ITyre
     * @createTime 2019/9/22 16:49
     * @throws
     */
    ITyre getTyre();

    /**
     * 用于创建座椅产品等级结构的产品实例
     * @title getSeat
     * @description
     * @author Jjcc
     * @return cn.demo.factorys.review1.abstractfactory.ISeat
     * @createTime 2019/9/22 16:51
     * @throws
     */
    ISeat getSeat();

    /**
     * 用于创建引擎产品等级结构的产品实例
     * @title getEngine
     * @description
     * @author Jjcc
     * @return cn.demo.factorys.review1.abstractfactory.IEngine
     * @createTime 2019/9/22 16:51
     * @throws
     */
    IEngine getEngine();
}

/**
 * 一个产品族
 */
class BenzCarFactory implements ICarFactory {
    @Override
    public ITyre getTyre() {
        return new BenzTyreImpl();
    }

    @Override
    public ISeat getSeat() {
        return new BenzSeat();
    }

    @Override
    public IEngine getEngine() {
        return new BenzEngineImpl();
    }
}

/**
 * 增加新的产品族只需要新增类
 */
class AudiCarFactory implements ICarFactory {
    @Override
    public ITyre getTyre() {
        return new AudiTyreImpl();
    }

    @Override
    public ISeat getSeat() {
        return new AudiSeat();
    }

    @Override
    public IEngine getEngine() {
        return new AudiEngineImpl();
    }
}