package cn.demo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构建角色，就是Composite类，可以包含子节点；
 * @author Jjcc
 * @version 1.0.0
 * @description 学校类,可以管理学院类（College）
 * @className University.java
 * @createTime 2019年09月02日 23:23:00
 */
public class University extends BaseOrganizationComponent{

    List<BaseOrganizationComponent> baseOrganizationComponents = new ArrayList<>();

    public University(String name, String description) {
        super(name, description);
    }

    /**
     * 重写抽象构建角色类的add方法
     * @title add
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/9/3 16:11
     * @throws
     */
    @Override
    protected void add(BaseOrganizationComponent baseOrganizationComponent) {
        baseOrganizationComponents.add(baseOrganizationComponent);
    }

    /**
     * 重写抽象构建角色类的remove方法
     * @title remove
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/9/3 16:19
     * @throws
     */
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

        //遍历 organizationComponents
        for (BaseOrganizationComponent organizationComponent : baseOrganizationComponents) {
            organizationComponent.print();
        }
    }
}







