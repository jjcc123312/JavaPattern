package main.java.cn.demo.factorys.abstractfactory1;

/**
 * 产品族产品结构 - 工厂类实现类
 * 高端汽车产品结构; 选择该结构中需要的产品种类
 * Create by Jjcc on 2019/7/2 23:10
 *
 * @author Jjcc
 */
public class LuxuryCarFactoryImpl implements ICarFactory{

    @Override
    public IEngine createEngine() {
        return new LuxuryEngineImpl();
    }

    @Override
    public ITyre createTyre() {
        return new LuxuryTyreImpl();
    }

    @Override
    public ISeat createTSeat() {
        return new LuxurySeatImpl();
    }
}
