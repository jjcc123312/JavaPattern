package main.java.cn.demo.factorys.abstractfactory1;

/**
 * car-座椅
 * Create by Jjcc on 2019/7/2 22:54
 *
 * @author Jjcc
 */
public interface ISeat {

    /**
     * 皮质
     */
    void type();
}

class LuxurySeatImpl implements ISeat {
    @Override
    public void type() {
        System.out.println("真皮座椅!");
    }
}

class LowSeatImpl implements ISeat {
    @Override
    public void type() {
        System.out.println("人造皮座椅!");
    }
}
