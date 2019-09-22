package cn.demo.factorys.review1.abstractfactory;

/**
 * 产品类的接口；
 * 引擎类
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className IEngine.java
 * @createTime 2019年09月22日 16:40:00
 */
public interface IEngine {
    /**
     * 什么引擎
     * @author: Jjcc
     * @title: brand
     * @param: []
     * @return: void
     * @createTime: 2019/7/11 23:04
     * @throws:
     */
    void brand();
}

class BenzEngineImpl implements IEngine {
    @Override
    public void brand() {
        System.out.println("奔驰引擎");
    }
}

class AudiEngineImpl implements IEngine {
    @Override
    public void brand() {
        System.out.println("奥迪引擎");
    }
}
