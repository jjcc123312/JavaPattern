package cn.demo.bridges.review3;

/**
 * 接口类，行为实现；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className IBrand.java
 * @createTime 2019年09月22日 22:49:00
 */
public interface IBrand {

    /**
     * 开机
     * @title open
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/8/22 15:28
     * @throws
     */
    void open();

    /**
     * 关机
     * @title close
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/8/22 15:29
     * @throws
     */
    void close();

    /**
     * 打电话
     * @title call
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/8/22 15:29
     * @throws
     */
    void call();
}

/**
 * 品牌类具体的实现
 */
class XiaoMiImpl implements IBrand {
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
