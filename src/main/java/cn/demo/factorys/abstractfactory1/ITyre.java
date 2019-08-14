package main.java.cn.demo.factorys.abstractfactory1;

/**
 * car-轮胎
 * Create by Jjcc on 2019/7/2 22:55
 *
 * @author Jjcc
 */
public interface ITyre {

    /**
     * 轮胎型号
     */
    void type();
}

class LuxuryTyreImpl implements ITyre {
    @Override
    public void type() {
        System.out.println("米其林轮胎!");
    }

}

class LowTyreImpl implements ITyre {
    @Override
    public void type() {
        System.out.println("小众轮胎!");
    }
}
