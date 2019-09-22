package cn.demo.factorys.review1.methodfactory;

/**
 * 产品类接口
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Phone.java
 * @createTime 2019年09月22日 15:23:00
 */
public interface Phone {

    /**
     * 手机方法
     */
    void method();
}

class HwPhone implements Phone {
    @Override
    public void method() {
        System.out.println("华为手机！");
    }
}

class XmPhone implements Phone {
    @Override
    public void method() {
        System.out.println("小米手机！");
    }
}

