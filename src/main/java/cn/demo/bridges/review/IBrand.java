package cn.demo.bridges.review;

/**
 *
 * 品牌接口
 * @author Jjcc
 * @version 1.0.0
 * @Description
 * @ClassName IBrand.java
 * @createTime 2019年08月22日 15:21:00
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

class VivoImple implements IBrand {
    @Override
    public void open() {
        System.out.println("vivo手机开机！");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关机！");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话！");
    }
}

class XiaoMiImple implements IBrand {
    @Override
    public void open() {
        System.out.println("小米手机开机！");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机！");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话！");
    }
}
