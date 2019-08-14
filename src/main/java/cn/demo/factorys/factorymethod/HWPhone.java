package main.java.cn.demo.factorys.factorymethod;

/**
 * Create by Jjcc on 2019/7/1 21:04
 *
 * @author Jjcc
 */
public class HWPhone implements Phone {
    @Override
    public void call() {
        System.out.println("华为手机打电话!!!");
    }
}
