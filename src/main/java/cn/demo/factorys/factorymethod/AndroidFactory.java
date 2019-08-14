package main.java.cn.demo.factorys.factorymethod;

/**
 * Create by Jjcc on 2019/7/1 21:01
 *
 * @author Jjcc
 */
public class AndroidFactory implements PhoneFactory {
    @Override
    public Phone create() {
        return new Android();
    }
}
