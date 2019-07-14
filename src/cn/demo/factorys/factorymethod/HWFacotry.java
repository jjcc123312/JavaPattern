package cn.demo.factorys.factorymethod;

/**
 * Create by Jjcc on 2019/7/1 21:05
 *
 * @author Jjcc
 */
public class HWFacotry implements PhoneFactory {
    @Override
    public Phone create() {
        return new HWPhone();
    }
}
