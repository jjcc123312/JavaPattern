package cn.demo.strategy;

/**
 * 策略模式：定义算法族（策略组），分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户；
 *          允许用户从该算法族中选择某一个算法解决某一个问题，同时可以方便的更换算法或增加新的算法，并且由客户决定更换哪个算法；
 * 策略模式体现的几种设计原则：
 *      1.面向接口开发，而不是具体的实现类（策略模式中定义了策略接口）；
 *      2.使用组合/聚合代替了继承；
 *      3.把变化的代码从不变的代码中分离开来；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Client.java
 * @createTime 2019年09月08日 23:00:00
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(new NewCustomerManyStrategyImpl());

        context.pringPrice(1111);
    }
}
