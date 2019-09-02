package cn.demo.decorators.reviewone;

/**
 * ConcreteComponent具体构建对象（真实对象）
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Coffee.java
 * @createTime 2019年08月27日 23:24:00
 */
public class Coffee extends BaseDrink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}

/**
 * 真实对象：LongBlack咖啡
 */
class LongBlack extends Coffee {

    public LongBlack() {
        setDes(" longblack ");
        setPrice(5.0f);
    }
}

/**
 * 真实对象：意大利咖啡
 */
class Espresso extends Coffee {

    public Espresso() {
        setDes(" 意大利咖啡 ");
        setPrice(6.0f);
    }
}
