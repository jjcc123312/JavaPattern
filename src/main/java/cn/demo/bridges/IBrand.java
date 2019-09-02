package cn.demo.bridges;

/**
 * 接口
 * @author Jjcc
 * @version 1.0.0
 * @Description
 * @ClassName Brand.java
 * @createTime 2019年08月22日 14:24:00
 */
public interface IBrand {
    /**
     * 开机
     * @title open
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/8/22 14:21
     * @throws
     */
    void open();

    /**
     * 关机
     * @title close
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/8/22 14:21
     * @throws
     */
    void close();

    /**
     * 打电话
     * @title call
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/8/22 14:21
     * @throws
     */
    void call();
}
