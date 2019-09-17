package cn.demo.chainofresp;

/**
 * 请求类；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className LeaveRequest.java
 * @createTime 2019年09月15日 21:15:00
 */
public class LeaveRequest {

    private String empName;
    private int leaveDays;
    private String reason;


    public LeaveRequest(String empName, int leaveDays, String reason) {
        super();
        this.empName = empName;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getLeaveDays() {
        return leaveDays;
    }
    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
}
