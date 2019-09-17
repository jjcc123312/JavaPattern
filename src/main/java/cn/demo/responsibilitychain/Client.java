package cn.demo.responsibilitychain;

/**
 * 职责链模式：
 *      又叫责任链模式了，为请求创建了一个接收者对象的链，这种模式让请求的发送者和接收者进行了解耦；
 *      职责链模式中通常每个接收者都包含另一个接收者的引用（单向链表）；将处理相同类请求的对象连成一条链，所提交的请求沿着链传递，
 *      链中的对象逐个判断是否有能力处理该请求，能则处理，不能则传递给链中的下一个对象来处理；
 *  职责链中的几种角色：
 *      Handler：抽象构建角色，所有具体处理对象的父类；
 *      ConcreteHandler：真实构建角色，具体的构建角色；处理它自己负责的请求，能则处理，不能则传递给他的后继者（即下一个处理对象）
 *              去处理，从而形成一个职责链；
 *      Request：一个请求，包含很多属性；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Client.java
 * @createTime 2019年09月15日 22:07:00
 */
public class Client {
    public static void main(String[] args){
        // TODO Auto-generated method stub
        //创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 11100, 1);

        //创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");


        //需要将各个审批级别的下一个设置好 (处理人构成环形: )
        departmentApprover.setNextApprover(collegeApprover);
        collegeApprover.setNextApprover(viceSchoolMasterApprover);

        departmentApprover.processRequest(purchaseRequest);
//        viceSchoolMasterApprover.processRequest(purchaseRequest);

    }
}
