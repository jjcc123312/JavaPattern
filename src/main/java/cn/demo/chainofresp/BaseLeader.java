package cn.demo.chainofresp;

/**
 * 抽象类，所有handler类都继承该类；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Leader.java
 * @createTime 2019年09月15日 21:11:00
 */
public abstract class BaseLeader {

    protected String name;

    protected BaseLeader nextLeader;

    public BaseLeader(String name) {
        this.name = name;
    }

    /**
     * 链表结构中指向下一个节点的指针
     * @title setLeader
     * @description
     * @author Jjcc
     * @param leader
     * @return void
     * @createTime 2019/9/15 21:13
     * @throws
     */
    public void setNextLeader(BaseLeader leader) {
        this.nextLeader = leader;
    }

    /**
     * 处理方法，每个Leader的子类都需要重写该方法；
     * @title handleRequest
     * @description
     * @author Jjcc
     * @param leaveRequest 请求对象
     * @return void
     * @createTime 2019/9/15 21:16
     * @throws
     */
    public abstract void handleRequest(LeaveRequest leaveRequest);
}
