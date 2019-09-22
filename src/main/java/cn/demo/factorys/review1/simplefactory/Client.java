package cn.demo.factorys.review1.simplefactory;

/**
 * 实现了创建者和调用者的分离
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Client.java
 * @createTime 2019年09月22日 14:49:00
 */
public class Client {

    public static void main(String[] args){
        Phone phone = SimpleFactoryDemo.phoneFactory("XIAOMI");

        phone.method();

    }
}
