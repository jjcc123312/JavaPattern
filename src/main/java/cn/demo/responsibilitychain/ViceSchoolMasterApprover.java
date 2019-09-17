package cn.demo.responsibilitychain;

/**
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className ViceSchoolMasterApprover.java
 * @createTime 2019年09月16日 21:45:00
 */
public class ViceSchoolMasterApprover extends BaseApprover {
    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getPrice() <= 30000) {
            System.out.println(" 请求编号 id= " + request.getId() + " 被 " + this.name + " 处理");
        }else {
            System.out.println("没有了！！！");
        }
    }
}
