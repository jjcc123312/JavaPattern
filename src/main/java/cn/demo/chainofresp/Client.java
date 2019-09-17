package cn.demo.chainofresp;

/**
 * 职责链模式：
 *      又叫责任链模式，为请求创建了一个接收者对象的链，这种模式让请求的发送者和接收者进行了解耦；
 *      职责链模式中通常每个接收者对象都包含指向另一个接收者的引用（单向链表）。将能够处理同一类请求的对象连成一条链，
 *      所提交的请求沿着链传递，链上的对象逐个判断是否有能力处理该请求，能则处理，不能则传递给链上的下一个对象；
 * 职责链中的角色：
 *      Handler：接收者对象的抽象构建角色，定义了一个处理请求的接口；
 *      ConcreteHandle：具体的接收者对象，处理它自己负责的请求，可以访问他的后继者（当前对象中包含的下一个对象指针）；如果
 *              可以处理当前请求，则处理，否则就将该请求传递给后继者去处理，从而形成一条职责链；
 *      Request: 表示一个请求，可以包含很多属性；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Client.java
 * @createTime 2019年09月15日 21:10:00
 */
public class Client {

    public static void main(String[] args){
        BaseLeader a = new Director("张三");
        BaseLeader b = new Manager("李四");
        BaseLeader c = new GeneralManager("王五");
        //组织责任链对象的关系
        a.setNextLeader(b);
        b.setNextLeader(c);

        //开始请假操作
        LeaveRequest req1 = new LeaveRequest("TOM", 2, "回英国老家探亲！");
        a.handleRequest(req1);
    }
}
