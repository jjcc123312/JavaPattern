package cn.demo.composite.review1;

/**
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Department.java
 * @createTime 2019年09月03日 21:24:00
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
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void print() {
        System.out.println("----------------" + getName() + "----------------");
    }
}
