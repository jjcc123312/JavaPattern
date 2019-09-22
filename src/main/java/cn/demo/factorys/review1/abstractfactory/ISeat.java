package cn.demo.factorys.review1.abstractfactory;

/**
 * 产品类的接口；
 * 座椅类
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className ISeat.java
 * @createTime 2019年09月22日 16:42:00
 */
public interface ISeat {

    /**
     * 什么座椅
     * @title brand
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/9/22 16:43
     * @throws
     */
    void brand();
}

class BenzSeat implements ISeat {
    @Override
    public void brand() {
        System.out.println("奔驰座椅");
    }
}

class AudiSeat implements ISeat {
    @Override
    public void brand() {
        System.out.println("奥迪座椅");
    }
}
