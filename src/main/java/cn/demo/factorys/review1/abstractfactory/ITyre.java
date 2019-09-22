package cn.demo.factorys.review1.abstractfactory;

/**
 * 产品类的接口；轮胎
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className ICar.java
 * @createTime 2019年09月22日 16:38:00
 */
public interface ITyre {

    /**
     * 什么轮胎
     * @author Jjcc
     * @title brand
     * @param: []
     * @return void
     * @createTime: 2019/7/11 23:01
     * @throws:
     */
    void brand();
}

class BenzTyreImpl implements ITyre {
    @Override
    public void brand() {
        System.out.println("奔驰轮胎");
    }
}

class AudiTyreImpl implements ITyre {
    @Override
    public void brand() {
        System.out.println("奥迪轮胎");
    }
}
