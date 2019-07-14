package cn.demo.factorys.abstractfactory1;

/**
 * 产品族产品结构 - 工厂实现类
 * 低端汽车产品结构; 选择需要的产品种类
 * Create by Jjcc on 2019/7/2 23:17
 *
 * @author Jjcc
 */
public class LowCarFactoryImpl implements ICarFactory{
    @Override
    public IEngine createEngine() {
        return new LowEngineImpl();
    }

    @Override
    public ITyre createTyre() {
        return new LowTyreImpl();
    }

    @Override
    public ISeat createTSeat() {
        return new LowSeatImpl();
    }
}
