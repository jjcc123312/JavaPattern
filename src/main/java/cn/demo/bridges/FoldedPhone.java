package cn.demo.bridges;


/**
 * @author Jjcc
 * @version 1.0.0
 * @Description
 * @ClassName FoldedPhone.java
 * @createTime 2019年08月22日 14:46:00
 */
public class FoldedPhone extends BasePhone {

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
