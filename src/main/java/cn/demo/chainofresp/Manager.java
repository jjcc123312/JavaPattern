package cn.demo.chainofresp;

/**
 * 经理
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Manager.java
 * @createTime 2019年09月15日 21:24:00
 */
public class Manager extends BaseLeader {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 10) {
            System.out.println("员工："+leaveRequest.getEmpName()+"请假，天数："+leaveRequest.getLeaveDays()+",理由："+leaveRequest.getReason());
            System.out.println("经理："+this.name+",审批通过！");
        } else {
            if (null != this.nextLeader) {
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
