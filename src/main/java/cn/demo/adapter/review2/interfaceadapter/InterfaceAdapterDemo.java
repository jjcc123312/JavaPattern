package cn.demo.adapter.review2.interfaceadapter;

/**
 * Adapter：使原本因为接口不兼容而无法一起工作的两个类可以一起工作；
 *          把一个类的接口转换成客户端期待的接口；
 * 三个角色：
 *      目标（Target）：客户端所期待的目标；
 *      源（Adaptee）：需要被适配的接口或类型；
 *      适配器（Adapter）：连接目标和源的中间对象；
 * 接口适配器（缺省适配模式）：如果不准备实现接口中所有的抽象方法，可以定义一个抽象类并实现此接口，重写接口中所有的方法（空方法），在定义一个类
 * 继承抽象类，想要使用接口中的方法就重写哪个方法；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className InterfaceAdapterDemo.java
 * @createTime 2019年09月07日 22:56:00
 */
public class InterfaceAdapterDemo {
}
