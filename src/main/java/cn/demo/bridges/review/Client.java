package cn.demo.bridges.review;

/**
 * 桥接模式：将实现与抽象放在两个不同的类层次中，使两个层次可以保持各部分的独立性以及应对他们的功能扩展
 * @author Jjcc
 * @version 1.0.0
 * @Description
 * @ClassName Client.java
 * @createTime 2019年08月22日 15:21:00
 */
public class Client {

    public static void main(String[] args){
        FoldedPhone foldedPhone = new FoldedPhone(new XiaoMiImple());
        foldedPhone.call();
        foldedPhone.open();
        foldedPhone.close();

        System.out.println("-------vivo手机-------------");

        FoldedPhone foldedPhone1 = new FoldedPhone(new VivoImple());
        foldedPhone1.call();
        foldedPhone1.open();
        foldedPhone1.close();
    }
}
