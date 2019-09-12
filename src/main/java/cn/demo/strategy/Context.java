package cn.demo.strategy;

/**
 * Context：负责和具体的策略类交互，这样的话，具体的算法和直接的客户端调用分离了，使得算法可以独立于客户端独立的变化。
 *
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Context.java
 * @createTime 2019年09月08日 23:16:00
 */
public class Context {

    /**
     * 算法族接口；使用组合方式
     */
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void pringPrice(double param) {
        System.out.println("您该报价："+strategy.getPrice(param));
    }


}
