package main.java.cn.demo.factorys.abstractfactory1;

/**
 * car-引擎
 * Create by Jjcc on 2019/7/2 22:52
 *
 * @author Jjcc
 */
public interface IEngine {
    /**
     * 运转速度
     */
    void run();

    /**
     * 启动速度
     */
    void start();
}

class LuxuryEngineImpl implements IEngine {
    @Override
    public void run() {
        System.out.println("运转速度快!");
    }

    @Override
    public void start() {
        System.out.println("启动速度快!");
    }
}

class LowEngineImpl implements IEngine {
    @Override
    public void run() {
        System.out.println("运转速度较慢!");
    }

    @Override
    public void start() {
        System.out.println("启动速度较慢!");
    }
}
