package cn.demo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构建角色，可以包含子节点；
 * @author Jjcc
 * @version 1.0.0
 * @description 学院类；可以管理系(专业)（Department）
 * @className College.java
 * @createTime 2019年09月03日 15:56:00
 */
public class College  extends BaseOrganizationComponent{

    List<BaseOrganizationComponent> baseOrganizationComponents = new ArrayList<>();

    public College(String name, String description) {
        super(name, description);
    }

    @Override
    protected void add(BaseOrganizationComponent baseOrganizationComponent) {
        baseOrganizationComponents.add(baseOrganizationComponent);
    }

    @Override
    protected void remove(BaseOrganizationComponent baseOrganizationComponent) {
        baseOrganizationComponents.remove(baseOrganizationComponent);
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
        System.out.println("----------" + getName() + "----------");

        for (BaseOrganizationComponent baseOrganizationComponent : baseOrganizationComponents) {
            baseOrganizationComponent.print();
        }
    }
}
