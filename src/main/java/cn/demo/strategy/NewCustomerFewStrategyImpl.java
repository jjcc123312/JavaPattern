package cn.demo.strategy;

/**
 * 算法族的某一个具体构建类
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className NewCustomerFewStrategyImpl.java
 * @createTime 2019年09月08日 23:13:00
 */
public class NewCustomerFewStrategyImpl implements IStrategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("不打折，原价");
        return standardPrice;
    }
}
