package cn.demo.responsibilitychain;

/**
 * ConcreteHandler：具体的处理类，可以访问他的后继者；处理它自己负责的请求，能则处理，不能则将请求传递给他的后继者，这样就形成了一条职责链；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className DepartmentApprover.java
 * @createTime 2019年09月16日 21:36:00
 */
public class DepartmentApprover extends BaseApprover {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() <= 3000) {
            System.out.println(" 请求编号 id= " + request.getId() + " 被 " + this.name + " 处理");
        } else {
            this.nextApprover.processRequest(request);
        }
    }
}
