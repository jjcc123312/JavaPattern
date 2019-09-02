package cn.demo.bridges.review;

/**
 * 桥接类
 * @author Jjcc
 * @version 1.0.0
 * @Description
 * @ClassName BasePhone.java
 * @createTime 2019年08月22日 15:32:00
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


/**
 * 折叠手机类
 */
class FoldedPhone extends BasePhone {
    public FoldedPhone(IBrand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println(" 折叠样式手机 ");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println(" 折叠样式手机 ");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println(" 折叠样式手机 ");
    }
}
