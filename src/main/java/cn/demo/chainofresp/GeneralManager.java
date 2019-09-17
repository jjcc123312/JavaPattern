package cn.demo.chainofresp;

/**
 * 总经理
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className GeneralManager.java
 * @createTime 2019年09月15日 21:26:00
 */
public class GeneralManager extends BaseLeader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 30) {
            System.out.println("员工："+request.getEmpName()+"请假，天数："+request.getLeaveDays()+",理由："+request.getReason());
            System.out.println("总经理："+this.name+",审批通过！");
        } else {
            if (null != this.nextLeader) {
                System.out.println("莫非"+request.getEmpName()+"想辞职，居然请假"+request.getLeaveDays()+"天！");
            }
        }
    }
}
