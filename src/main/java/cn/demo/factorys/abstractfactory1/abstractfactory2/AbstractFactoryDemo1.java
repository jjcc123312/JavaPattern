package cn.demo.factorys.abstractfactory1.abstractfactory2;

/**
 * 抽象工厂模式;
 * 需要多个定义产品的接口,实现同一产品接口的多个实现类称之为产品等级结构;
 * 需要定义一个产品族工厂接口,工厂接口的实现类可以自由搭配产品等级结构中的产品
 * Create by Jjcc on 2019/7/2 22:50
 *
 * @author Jjcc
 */
public class AbstractFactoryDemo1 {
    public static void main(String[] args){
//        ICarFactory benzCarFactory = new BenzCarFactory();
//        IEngine engine = benzCarFactory.createEngine();
//        ISeat seat = benzCarFactory.createSeat();
//        ITyre tyre = benzCarFactory.createTyre();
//        engine.brand();
//        seat.brand();
//        tyre.brand();
//
//        System.out.println("------------------");
        long begin = System.currentTimeMillis();

//        ICarFactory audiCarFactory = new AudiCarFactory();

        ICarFactory benzCarFactory = new BenzCarFactory();
//        try {
//            IEngine engine = benzCarFactory.createEngine();
//            engine.brand();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }


        long end = System.currentTimeMillis();

        System.out.println("Time: " + (end - begin));

    }
}


/**
 * 产品等级结构 - 引擎接口
 */
interface IEngine {
    /**
     * 品牌
     */
    void brand();
}

/**
 * 产品等级结构 - 具体产品实现类
 */
class BenzEngineImpl implements IEngine,Cloneable {
    @Override
    public void brand() {
        System.out.println("奔驰引擎!");
    }

    @Override
    protected BenzEngineImpl clone() throws CloneNotSupportedException {
        return (BenzEngineImpl) super.clone();
    }
}
class AudiEngineImpl implements IEngine,Cloneable {
    @Override
    public void brand() {
        System.out.println("奥迪引擎!");
    }

    @Override
    protected AudiEngineImpl clone() throws CloneNotSupportedException {
        return (AudiEngineImpl) super.clone();
    }
}

/**
 * 产品等级结构 - 轮胎接口
 */
interface ITyre {
    /**
     * 品牌
     */
    void brand();
}

/**
 * 产品等级结构 - 轮胎具体实现类
 */
class BenzTyreImpl implements ITyre {
    @Override
    public void brand() {
        System.out.println("奔驰轮胎!");
    }
}
class AudiTyreImpl implements ITyre {
    @Override
    public void brand() {
        System.out.println("奥迪轮胎!");
    }
}

/**
 * 产品等级结构 - 座椅接口
 */
interface ISeat {
    /**
     * 品牌
     */
    void brand();
}

/**
 * 产品等级结构 - 具体实现类
 */
class BenzSeatImpl implements ISeat {
    @Override
    public void brand() {
        System.out.println("奔驰座椅!");
    }
}
class AudiSeatImpl implements ISeat {
    @Override
    public void brand() {
        System.out.println("奥迪座椅!");
    }
}

/**
 * 抽象工厂类
 */
interface ICarFactory {

    /**
     * 选择引擎产品等级结构中哪一个产品
     * @return IEngine
     */
    IEngine createEngine() throws CloneNotSupportedException;

    /**
     * 选择轮胎产品等级结构中哪一个产品
     * @return
     */
    ITyre createTyre();

    /**
     * 选择座椅产品等级结构中哪一个产品
     * @return
     */
    ISeat createSeat();
}

/**
 * 产品族;
 */
class BenzCarFactory implements ICarFactory {
    @Override
    public IEngine createEngine() {
        return new BenzEngineImpl();
    }

    @Override
    public ITyre createTyre() {
        return new BenzTyreImpl();
    }

    @Override
    public ISeat createSeat() {
        return new BenzSeatImpl();
    }
}

class AudiCarFactory implements ICarFactory {
    @Override
    public IEngine createEngine() throws CloneNotSupportedException {
        return new AudiEngineImpl().clone();
    }

    @Override
    public ITyre createTyre() {
        return new AudiTyreImpl();
    }

    @Override
    public ISeat createSeat() {
        return new AudiSeatImpl();
    }
}



