package cn.demo.factorys.factorymethod;

/**
 * Create by Jjcc on 2019/7/1 21:03
 *
 * @author Jjcc
 */
public class Client1 {

    public static void main(String[] args){
        Phone phone = new AppleFactory().create();
        phone.call();

        Phone phone1 = new HWFacotry().create();
        phone1.call();
    }
}
