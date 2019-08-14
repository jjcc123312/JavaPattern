package main.java.cn.demo.factorys.abstractfactory1;

/**
 * 产品族产品结构 - 工厂实现类
 * 中端汽车; 选择产品种类
 * Create by Jjcc on 2019/7/2 23:39
 *
 * @author Jjcc
 */
public class PopularFactoryImpl implements ICarFactory {
    @Override
    public IEngine createEngine() {
        return new LowEngineImpl();
    }

    @Override
    public ITyre createTyre() {
        return new LuxuryTyreImpl();
    }

    @Override
    public ISeat createTSeat() {
        return new LowSeatImpl();
    }

//    @Override
//    ICarWindow createWindow() {
//        return null;
//    }
}
