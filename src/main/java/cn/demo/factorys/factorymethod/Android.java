package cn.demo.factorys.factorymethod;

/**
 * Create by Jjcc on 2019/7/1 20:55
 *
 * @author Jjcc
 */
public class Android implements Phone {
    @Override
    public void call() {
        System.out.println("安卓手机打电话!!!");
    }
}
