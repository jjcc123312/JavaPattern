package cn.demo.composite.review1;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构建角色，就是Composite角色，可以有子对象；
 * @author Jjcc
 * @version 1.0.0
 * @description 学校类，可以管理院系（College）
 * @className University.java
 * @createTime 2019年09月03日 21:08:00
 */
public class University extends BaseOrganizationComponent {

    /**
     * 学院集合
     */
    List<BaseOrganizationComponent> bocList =  new ArrayList<>();

    public University(String name, String description) {
        super(name, description);
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
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void print() {
        System.out.println("------" + getName() + "------");

        for (BaseOrganizationComponent college : bocList) {
            college.print();
        }
    }
}
