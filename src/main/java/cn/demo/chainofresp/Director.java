package cn.demo.chainofresp;

/**
 * 主任
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Director.java
 * @createTime 2019年09月15日 21:19:00
 */
public class Director extends BaseLeader {
    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 3) {
            System.out.println("员工："+request.getEmpName()+"请假，天数："+request.getLeaveDays()+",理由："+request.getReason());
            System.out.println("主任："+this.name+",审批通过！");
        } else {
            if (null != this.nextLeader) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
