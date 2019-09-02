package cn.demo.decorators;

/**
 * 装饰模式：不需要通过继承增加子类就能够扩展对象新的功能，使用关联关系代替继承关系；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Client.java
 * @createTime 2019年08月22日 22:26:00
 */
public class Client {
    public static void main(String[] args){
//        try {
//            FileInputStream fileInputStream = new FileInputStream("");
//
//            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        FlyCar flyCar = new FlyCar(new CarImpl());
        flyCar.move();
        flyCar.fly();

        System.out.println("--------------------分割线---------------------");

        WaterCar waterCar = new WaterCar(new CarImpl());
        waterCar.move();
        waterCar.swim();
    }
}
