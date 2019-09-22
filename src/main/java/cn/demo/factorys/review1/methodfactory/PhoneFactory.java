package cn.demo.factorys.review1.methodfactory;

/**
 * 手机工厂接口
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className PhoneFactory.java
 * @createTime 2019年09月22日 15:26:00
 */
public interface PhoneFactory {

    /**
     * 创建实例的方法
     * @title getInstance
     * @description
     * @author Jjcc
     * @return cn.demo.factorys.review1.methodfactory.Phone
     * @createTime 2019/9/22 15:27
     * @throws
     */
    Phone getInstance();
}

class HwPhoneFactory implements PhoneFactory {
    @Override
    public Phone getInstance() {
        return new HwPhone();
    }
}

class XmPhoneFactory implements PhoneFactory {
    @Override
    public Phone getInstance() {
        return new XmPhone();
    }
}
