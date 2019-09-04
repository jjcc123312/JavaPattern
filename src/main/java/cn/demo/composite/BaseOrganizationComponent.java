package cn.demo.composite;

/**
 * 抽象构建角色，定义了叶子和容器的共同点；在适当情况下，实现所有类共有的接口默认行为；
 * @author Jjcc
 * @version 1.0.0
 * @description 抽象构建类；叶子和容器的共同接口
 * @className OrganizationComponent.java
 * @createTime 2019年09月02日 22:58:00
 */
public abstract class BaseOrganizationComponent {

    private String name;

    private String description;

    protected void add(BaseOrganizationComponent baseOrganizationComponent) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(BaseOrganizationComponent baseOrganizationComponent) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    public BaseOrganizationComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 打印方法！
     * @title print
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/9/2 23:22
     * @throws
     */
    public abstract void print();
}
