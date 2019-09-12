package cn.demo.bridges.reviewtwo;

/**
 * 桥接模式：将抽象与实现放在两个不同的类层次中，使两个层次保持各部分的独立性以及应对他们的功能扩展
 * 手机类-桥接类
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className BasePhone.java
 * @createTime 2019年08月22日 22:12:00
 */
public abstract class BasePhone {

    /**
     * 组合品牌
     */
    private IBrand brand;

    protected BasePhone(IBrand brand) {
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

class FoldedPhone extends BasePhone {

    protected FoldedPhone(IBrand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠手机!");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠手机!");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠手机!");
    }
}
