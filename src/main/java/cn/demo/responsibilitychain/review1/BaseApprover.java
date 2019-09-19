package cn.demo.responsibilitychain.review1;

/**
 * handler：抽象构建角色
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className BaseApprover.java
 * @createTime 2019年09月19日 07:41:00
 */
public abstract class BaseApprover {

    protected String name;

    protected BaseApprover nextApprover;


    public BaseApprover(String name) {
        this.name = name;
    }

    public BaseApprover getNextApprover() {
        return nextApprover;
    }

    public void setNextApprover(BaseApprover nextApprover) {
        this.nextApprover = nextApprover;
    }


    /**
     * 处理请求的接口
     * @title processRequest
     * @description
     * @author Jjcc
     * @param request
     * @return void
     * @createTime 2019/9/19 7:43
     * @throws
     */
    public abstract void processRequest(PurchaseRequest request);
}
