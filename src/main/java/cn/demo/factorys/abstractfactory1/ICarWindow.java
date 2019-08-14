package main.java.cn.demo.factorys.abstractfactory1;

/**
 * car-车窗
 * Create by Jjcc on 2019/7/2 23:48
 *
 * @author Jjcc
 */
public interface ICarWindow {

    /**
     * 窗户类型
     */
    void type();
}

class LuxuryWindowImpl implements ICarWindow {
    @Override
    public void type() {
        System.out.println("防弹的!");
    }
}

class LowWindowImpl implements ICarWindow {
    @Override
    public void type() {
        System.out.println("不防弹的!");
    }
}
