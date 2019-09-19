package cn.demo.responsibilitychain.review1;

/**
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className CollegeApprover.java
 * @createTime 2019年09月19日 07:48:00
 */
public class CollegeApprover extends BaseApprover {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() <= 8000) {
            System.out.println(" 请求编号 id= " + request.getId() + " 被 " + this.name + " 处理");
        } else {
            this.getNextApprover().processRequest(request);
        }

    }
}
