package cn.demo.bridges;

/**
 * 桥接模式：将实现与抽象放在两个不同的类层次中，使两个层次可以独立改变；
 * @author Jjcc
 * @version 1.0.0
 * @Description
 * @ClassName BrideesPatterDemo1.java
 * @createTime 2019年08月22日 11:33:00
 */
public class BrideesPatternDemo1 {
    public static void main(String[] args){
        FoldedPhone foldedPhone = new FoldedPhone(new VivoImpl());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();
    }
}

