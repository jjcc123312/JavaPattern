package cn.demo.bridges.review3;

/**
 * 桥接模式：将抽象与行为实现放在两个不同的类层次中，使两个层次可以独立的改变；
 *      通过使用组合，聚合以及继承等行为让不同的类承担不同的职责；
 *      桥接模式替代多继承方案，减少子类的个数；
 *      抽象类与接口是组合关系，其实是调用者与被调用者的关系；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Client.java
 * @createTime 2019年09月22日 22:42:00
 */
public class Client {
    public static void main(String[] args){
        BasePhone foldedPhone = new FoldedPhone(new XiaoMiImpl());

        foldedPhone.open();
    }
}
