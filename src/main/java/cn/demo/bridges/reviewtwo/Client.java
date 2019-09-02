package cn.demo.bridges.reviewtwo;

/**
 * 桥接模式：将实现与抽象放在不同的两个类层次中，使两个层次可以保持各部分的独立性以及应对它们的功能扩展
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Client.java
 * @createTime 2019年08月22日 21:30:00
 */
public class Client {

    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new XiaoMiImpl());
        foldedPhone.open();
        foldedPhone.close();
        foldedPhone.call();
    }
}
