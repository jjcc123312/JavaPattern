package cn.demo.composite;

/**
 * 叶子节点，没有子节点
 * @author Jjcc
 * @version 1.0.0
 * @description 系（专业）类，没有子节点
 * @className Deparment.java
 * @createTime 2019年09月03日 16:02:00
 */
public class Department extends BaseOrganizationComponent {


    public Department(String name, String description) {
        super(name, description);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
