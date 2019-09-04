package cn.demo.composite.review1;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构建角色：就是Composite对象，可以有子对象
 * @author Jjcc
 * @version 1.0.0
 * @description 学院类，可以管理专业类（Department）
 * @className College.java
 * @createTime 2019年09月03日 21:17:00
 */
public class College extends BaseOrganizationComponent{

    /**
     * 专业（系）集合
     */
    List<BaseOrganizationComponent> bocList =  new ArrayList<>();

    public College(String name, String description) {
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
    protected void add(BaseOrganizationComponent baseOrganizationComponent) {
        bocList.add(baseOrganizationComponent);
    }

    @Override
    protected void remove(BaseOrganizationComponent baseOrganizationComponent) {
        bocList.remove(baseOrganizationComponent);
    }

    @Override
    public void print() {
        System.out.println("------------" + getName() + "------------");

        for (BaseOrganizationComponent department : bocList) {
            department.print();
        }
    }
}
