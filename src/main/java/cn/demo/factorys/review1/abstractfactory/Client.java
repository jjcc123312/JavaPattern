package cn.demo.factorys.review1.abstractfactory;

/**
 * 抽象工厂方法：产品族是指由同一个工厂创建的，位于不同产品等级结构中的一组产品；
 *      用来生产不同产品等级结构中的所有产品，对于新增产品类，无能为力，支持新增产品族；
 * 模式定义：
 *      定义多个产品类的接口；
 *      定义一个用于创建产品族的接口，接口中有多个用于创建不同产品等级结构产品（不同实例对象）的方法；
 *      让子类决定实现各产品等级结构中的哪种产品；
 *
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Client.java
 * @createTime 2019年09月22日 16:02:00
 */
public class Client {

    public static void main(String[] args){
        ICarFactory benzCarFactory = new BenzCarFactory();

        benzCarFactory.getEngine().brand();
        benzCarFactory.getSeat().brand();
        benzCarFactory.getTyre().brand();
    }

}
