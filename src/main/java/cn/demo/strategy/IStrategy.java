package cn.demo.strategy;

/**
 * 抽象构建角色：算法族的接口
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className IStartegy.java
 * @createTime 2019年09月08日 23:10:00
 */
public interface IStrategy {

    /**
     * 算法方法；
     * @title getPrice
     * @description
     * @author Jjcc
     * @param standardPrice
     * @return double
     * @createTime 2019/9/8 23:11
     * @throws
     */
    double getPrice(double  standardPrice);
}
