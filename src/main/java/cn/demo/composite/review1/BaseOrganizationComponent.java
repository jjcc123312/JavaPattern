package cn.demo.composite.review1;

/**
 * 抽象构建角色（Component）：定义了叶子和容器的共同特性，在适当情况下，实现所有类共有的接口默认的行为；
 *
 * @author Jjcc
 * @version 1.0.0
 * @description 抽象构建类，叶子和容器共同的接口；
 * @className BaseOrganizationComponent.java
 * @createTime 2019年09月03日 20:58:00
 */
public abstract class BaseOrganizationComponent {

    private String name;

    private String description;

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
     * 容器构建角色类独有的方法
     * @title add
     * @description
     * @author Jjcc
     * @param baseOrganizationComponent
     * @return void
     * @createTime 2019/9/3 21:11
     * @throws
     */
    protected void add(BaseOrganizationComponent baseOrganizationComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 容器构建角色类独有的方法
     * @title remove
     * @description 
     * @author Jjcc
     * @param baseOrganizationComponent
     * @return void
     * @createTime 2019/9/3 21:12
     * @throws
     */
    protected void remove(BaseOrganizationComponent baseOrganizationComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 叶子和容器共有的方法，定义为抽象方法，必须重写
     * @title print
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/9/3 21:03
     * @throws
     */
    public abstract void print();

}







