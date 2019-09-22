package cn.demo.bridges.review3;

/**
 * 抽象构建角色，手机的父类；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className BasePhone.java
 * @createTime 2019年09月22日 22:47:00
 */
public abstract class BasePhone {

    private IBrand brand;

    public BasePhone(IBrand brand) {
        this.brand = brand;
    }

    public IBrand getBrand() {
        return brand;
    }

    protected abstract void open();
}

class FoldedPhone extends BasePhone {


    public FoldedPhone(IBrand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        IBrand brand = this.getBrand();
        brand.open();
        System.out.println("啦啦啦啦啦！");
    }
}
