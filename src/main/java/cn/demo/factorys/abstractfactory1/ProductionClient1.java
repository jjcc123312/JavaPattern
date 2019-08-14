package main.java.cn.demo.factorys.abstractfactory1;

/**
 * Create by Jjcc on 2019/7/2 23:23
 *
 * @author Jjcc
 */
public class ProductionClient1 {
    public static void main(String[] args){
        ICarFactory luxury = new LuxuryCarFactoryImpl();
        IEngine engine = luxury.createEngine();
        ISeat tSeat = luxury.createTSeat();
        ITyre tyre = luxury.createTyre();
        engine.run();
        engine.start();
        tSeat.type();
        tyre.type();
    }
}
