package cn.demo.decorators.reviewone;

/**
 * Component抽象构建角色；真实对象和装饰对象有相同的接口或父类。这样，客户端对象就能够以与真实对象一样的方式同装饰对象交互；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className IDrink.java
 * @createTime 2019年08月27日 23:18:00
 */
public abstract class BaseDrink {
    /**
     * 描述
     */
    public String des;

    private float price = 0.0f;

    /**
     * 获取描述
     * @title getDes
     * @description
     * @author Jjcc
     * @return java.lang.String
     * @createTime 2019/8/27 23:20
     * @throws
     */
    public String getDes() {
        return des;
    }
    /**
     * 设置描述
     * @title setDes
     * @description
     * @author Jjcc
     * @param des
     * @return void
     * @createTime 2019/8/27 23:21
     * @throws
     */
    public void setDes(String des) {
        this.des = des;
    }
    /**
     * 获取价格
     * @title getPrice
     * @description
     * @author Jjcc
     * @return float
     * @createTime 2019/8/27 23:21
     * @throws
     */
    public float getPrice() {
        return price;
    }
    /**
     * 设置价格
     * @title setPrice
     * @description
     * @author Jjcc
     * @param price
     * @return void
     * @createTime 2019/8/27 23:21
     * @throws
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 计算费用的抽象方法，子类来实现
     * @title cost
     * @description
     * @author Jjcc
     * @return float
     * @createTime 2019/8/27 23:22
     * @throws
     */
    public abstract float cost();
}
