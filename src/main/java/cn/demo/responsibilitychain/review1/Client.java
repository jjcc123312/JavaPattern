package cn.demo.responsibilitychain.review1;

/**
 * 职责链模式：
 *      又叫责任链模式，为请求创建一个接收者对象的链，这种模式让请求的发送者和处理者进行了解耦；
 *      职责链模式中通常每个接收者都包含另一个接收者的引用，把处理统一类请求的对象连成一条链，所提交的请求沿着链传递，
 *      链中的对象逐个判断是否能够处理该请求，能则处理，不能则将传递给链中的下一个对象；
 * 几种角色：
 *      Handler：抽象构建角色。所有具体接收者对象的父类；
 *      ConcreteHandler：具体构建角色。处理它自己负责的请求，能则处理，不能则传递给他的后继者来处理，从而形成一条职责链
 *      Request：一个请求，包含很多属性；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className iClient.java
 * @createTime 2019年09月19日 07:31:00
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31100, 1);

        //创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");

        departmentApprover.setNextApprover(collegeApprover);
        collegeApprover.setNextApprover(viceSchoolMasterApprover);

        departmentApprover.processRequest(purchaseRequest);

    }
}
