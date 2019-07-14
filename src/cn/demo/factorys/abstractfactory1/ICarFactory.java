package cn.demo.factorys.abstractfactory1;


/**
 * 产品族产品结构 - 工厂类接口
 * 一个产品结构需要的产品种类
 * Create by Jjcc on 2019/7/2 23:03
 *
 * @author Jjcc
 */
public interface ICarFactory{

    /**
     * 选择哪一类引擎产品
     * @return
     */
    IEngine createEngine();

    /**
     * 选择哪一类轮胎产品
     * @return
     */
    ITyre createTyre();

    /**
     * 选择哪一类座椅产品
     * @return
     */
    ISeat createTSeat();

    /**
     * 选择哪一类车窗
     * @return
     */
//    ICarWindow createWindow();

}
