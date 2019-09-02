package cn.demo.bridges;

/**
 * 品牌实现类
 * @author Jjcc
 * @version 1.0.0
 * @Description
 * @ClassName Vivo.java
 * @createTime 2019年08月22日 14:27:00
 */
public class VivoImpl implements IBrand{
    @Override
    public void open() {
        System.out.println("vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话");
    }
}
