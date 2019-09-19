package cn.demo.responsibilitychain.review1;

/**
 * 请求类；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className PurchaseRequest.java
 * @createTime 2019年09月16日 21:23:00
 */
public class PurchaseRequest {
    /**
     * 请求类型
     */
    private int type;
    /**
     * 请求金额
     */
    private float price;
    /**
     * id
     */
    private int id;

    /**
     * 构造器
     * @title PurchaseRequest
     * @description
     * @author Jjcc
     * @param type
     * @param price
     * @param id
     * @return
     * @createTime 2019/9/16 21:24
     * @throws
     */
    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }
    public int getType() {
        return type;
    }
    public float getPrice() {
        return price;
    }
    public int getId() {
        return id;
    }
}
