package cn.demo.strategy;

/**
 * 算法族抽象构建的某一个具体构建类
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className NewCustomerManyStrategyImpl.java
 * @createTime 2019年09月08日 23:15:00
 */
public class NewCustomerManyStrategyImpl implements IStrategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打九折");
        return standardPrice * 0.9;
    }
}
