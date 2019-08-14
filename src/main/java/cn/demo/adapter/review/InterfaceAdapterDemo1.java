package cn.demo.adapter.review;

/**
 * 适配器模式-接口适配器
 * 把一个类的类型变换为客户端所期望的另一种接口，从而使原本不能一起工作的两种接口可以一起工作；
 * 接口适配器（缺省适配模式）：如果不准备实现接口中的所有方法，可以写一个抽象类并实现该接口，重写所有的方法；再定义一个类继承该抽象类，当需要用到哪个
 * 类时就重写哪个方法；
 * @author Jjcc
 * @version 1.0.0
 * @Description
 * @ClassName InterfaceAdapterDemo1.java
 * @createTime 2019年07月15日 22:58:00
 */
public class InterfaceAdapterDemo1 {
    public static void main(String[] args){

    }
}

/**
 * 接口
 */
interface Server {

    /**
     * 远程SSH端口
     * @Description:
     * @author: Jjcc
     * @title: SSH
     * @param: []
     * @return: void
     * @createTime: 2019/7/15 23:05
     * @throws:
     */
    void portSSH();

    /**
     * IP地址
     * @Description:
     * @author: Jjcc
     * @title: ipAddress
     * @param: []
     * @return: void
     * @createTime: 2019/7/15 23:08
     * @throws:
     */
    void ipAddress();

    /**
     * 网络端口
     * @Description:
     * @author: Jjcc
     * @title: NET
     * @param: []
     * @return: void
     * @createTime: 2019/7/15 23:05
     * @throws:
     */
    void protNET();

    /**
     * Tomcat容器端口
     * @Description:
     * @author: Jjcc
     * @title: Tomcat
     * @param: []
     * @return: void
     * @createTime: 2019/7/15 23:06
     * @throws:
     */
    void portTomcat();

    /**
     * MySQL数据库端口
     * @Description:
     * @author: Jjcc
     * @title: Mysql
     * @param: []
     * @return: void
     * @createTime: 2019/7/15 23:06
     * @throws:
     */
    void protMysql();
}

/**
 * 抽象类；
 * 重写接口所有方法；
 */
abstract class BaseWrapper implements Server {
    @Override
    public void portSSH() {

    }

    @Override
    public void ipAddress() {

    }

    @Override
    public void protNET() {

    }

    @Override
    public void portTomcat() {

    }

    @Override
    public void protMysql() {

    }
}

class WebFunction extends BaseWrapper {
    @Override
    public void portTomcat() {
        System.out.println("8080");
    }

    @Override
    public void ipAddress() {
        System.out.println("192.168.1.1");
    }
}
