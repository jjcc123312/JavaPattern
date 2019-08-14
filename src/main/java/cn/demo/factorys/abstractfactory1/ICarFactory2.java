package main.java.cn.demo.factorys.abstractfactory1;

/**
 * Create by Jjcc on 2019/7/2 23:57
 *
 * @author Jjcc
 */
public interface ICarFactory2 {

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
}
