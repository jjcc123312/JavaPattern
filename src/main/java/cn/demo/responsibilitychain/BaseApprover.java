package cn.demo.responsibilitychain;

/**
 * Handler：抽象构建角色，所有具体处理类的父类；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Approver.java
 * @createTime 2019年09月16日 21:32:00
 */
public abstract class BaseApprover {

    /**
     * name
     */
    protected String name;

    /**
     * 下一个处理对象
     */
    protected BaseApprover nextApprover;

    public BaseApprover(String name) {
        this.name = name;
    }

    public void setNextApprover(BaseApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    /**
     * 处理请求的方法，是一个抽象方法，所有子类都必须重写该方法
     * @title processRequest
     * @description
     * @author Jjcc
     * @param request 请求
     * @return void
     * @createTime 2019/9/16 21:35
     * @throws
     */
    public abstract void processRequest(PurchaseRequest request);
}
