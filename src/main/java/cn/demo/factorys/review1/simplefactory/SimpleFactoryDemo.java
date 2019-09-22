package cn.demo.factorys.review1.simplefactory;

/**
 * 简单工厂模式：用于生产同一等级结构中的任意产品，对于新增产品需要修改代码；
 *      定义一个类专门创建其它实例对象，通常创建的实例对象都有共同的父类；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className SimpleFactoryDemo.java
 * @createTime 2019年09月22日 14:51:00
 */
public class SimpleFactoryDemo {

    public static Phone phoneFactory(String type) {
        Phone phone = null;
        switch (type) {
            case "HUAWEI" :
                phone = new HUAWEI();
                break;
            case "XIAOMI" :
                phone = new XIAOMI();
                break;
            default:
        }

        return phone;
    }

}

/**
 * 抽象构建角色
 */
interface Phone {

    /**
     * 方法一；
     * @title method
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/9/22 14:55
     * @throws
     */
    void method();
}

class HUAWEI implements Phone {
    @Override
    public void method() {
        System.out.println("HUAWEI手机！");
    }
}

class XIAOMI implements Phone {
    @Override
    public void method() {
        System.out.println("XIAOMI公司！");
    }
}
