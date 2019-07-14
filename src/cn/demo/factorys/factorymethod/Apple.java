package cn.demo.factorys.factorymethod;

/**
 * Create by Jjcc on 2019/7/1 20:54
 *
 * @author Jjcc
 */
public class Apple implements Phone {
    @Override
    public void call() {
        System.out.println("苹果手机打电话!!!");
    }
}
