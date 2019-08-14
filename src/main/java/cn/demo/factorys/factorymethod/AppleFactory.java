package main.java.cn.demo.factorys.factorymethod;

/**
 * Create by Jjcc on 2019/7/1 21:00
 *
 * @author Jjcc
 */
public class AppleFactory implements PhoneFactory {
    @Override
    public Phone create() {
        return new Apple();
    }
}
