package cn.demo.decorators;

/**
 * Component抽象构建角色：真实对象和装饰对象有相同的接口或父类，这样，客户端对象就能够以与真实对象相同的方式同装饰对象交互；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className ICar.java
 * @createTime 2019年08月27日 22:07:00
 */
public interface ICar {
    /**
     * 真实对象接口本身的方法
     * @title move
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/8/27 22:11
     * @throws
     */
    void move();
}

/**
 * ConcreteComponent具体构建对象（真实对象)
 */
class CarImpl implements ICar {
    @Override
    public void move() {
        System.out.println("陆地上跑！");
    }

}

/**
 * Decorator装饰对象
 */
class DecoratorCar implements ICar {
    @Override
    public void move() {
        System.out.println("陆地上跑");
    }
}

/**
 * ConcreteComponent具体装饰对象
 */
class FlyCar extends DecoratorCar {

    private ICar car;

    /**
     * 通过构造方法，具体装饰对象与真实对象组合起来；
     * @title FlyCar
     * @description
     * @author Jjcc
     * @param car
     * @return
     * @createTime 2019/8/27 22:20
     * @throws
     */
    public FlyCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }

    public void fly() {
        System.out.println("天上飞！");
    }
}

/**
 * ConcreateDecorator具体的装饰对象
 */
class WaterCar extends DecoratorCar {

    private ICar car;

    /**
     * 通过构造方法，具体装饰对象与真实对象组合起来；
     * @title WaterCar
     * @description
     * @author Jjcc
     * @param car
     * @return
     * @createTime 2019/8/27 22:25
     * @throws
     */
    public WaterCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }

    public void swim(){
        System.out.println("水上游！");
    }
}








