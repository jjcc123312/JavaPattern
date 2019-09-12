package cn.demo.strategy.review1;

/**
 * 策略模式（strategy）：定义算法族（策略组），分别封装起来，该模式让算法的更换独立于使用算法的客户；
 *      允许客户决定使用算法族中的某一个算法来解决某一个问题，同时可以方便的更换算法和新增算法，让客户决定更换哪个算法；
 * 策略模式使用的设计原则：
 *      1.面向接口开发，而不是具体的实现类（策略模式定义了策略接口）；
 *      2.使用组合/聚合的方式代替继承；
 *      3.把会变化的代码从不变的代码中分离开来；
 *
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Client.java
 * @createTime 2019年09月09日 21:18:00
 */
public class Client {
    public static void main(String[] args){
            Integer i1 = null;

            int i2 = i1 * 10;

        System.out.println("!!!!!!!!!");
    }
}
