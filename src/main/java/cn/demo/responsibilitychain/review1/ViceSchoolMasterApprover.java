package cn.demo.responsibilitychain.review1;

/**
 * ConcreteHandler:具体的处理类，处理它自己负责的请求，能则处理，不能则传递给它的后继者，这样就形成了一条链
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className ViceSchoolMasterApprover.java
 * @createTime 2019年09月19日 07:52:00
 */
public class ViceSchoolMasterApprover extends BaseApprover {
    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println(" 请求编号 id= " + request.getId() + " 被 " + this.name + " 处理");
    }
}
