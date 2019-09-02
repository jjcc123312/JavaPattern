package cn.demo.bridges;

/**
 * 抽象类-桥接类
 * @author Jjcc
 * @version 1.0.0
 * @Description
 * @ClassName PhoneBase.java
 * @createTime 2019年08月22日 14:25:00
 */
public abstract class BasePhone {

    /**
     * 组合品牌
     */
    private IBrand brand;

    public BasePhone(IBrand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }

}
