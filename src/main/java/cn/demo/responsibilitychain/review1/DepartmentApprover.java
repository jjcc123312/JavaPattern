package cn.demo.responsibilitychain.review1;

/**
 * 具体的处理对象，负责处理它自己负责的请求，能则处理，不能则传递给他的后继者，这样就形成了一条职责链；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className DepartmentApprover.java
 * @createTime 2019年09月19日 07:44:00
 */
public class DepartmentApprover extends BaseApprover {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() <= 3100) {
            System.out.println(" 请求编号 id= " + request.getId() + " 被 " + this.name + " 处理");
        } else {
            this.getNextApprover().processRequest(request);
        }
    }
}
