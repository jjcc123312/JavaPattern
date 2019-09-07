package cn.demo.observer;

/**
 * 观察者模式：当一个对象（目标对象Subject或Observable）状态发生改变时，其相关依赖对象（观察者Observer）皆得到通知并被自动更新；
 * @author Jjcc
 * @version 1.0.0
 * @description 气象局发布天气情况信息，各平台，客户接收通知。可以把订阅者或客户称之为观察者（Observer）;气象局发布的信息封装到对象中，
 *              称之为目标（Subject或Observable）
 * @className Client.java
 * @createTime 2019年09月04日 21:15:00
 */
public class Client {
    public static void main(String[] args) {

        //主题类
        ObservableA observableA = new ObservableA();

        observableA.setState(222);

        ObserverImplA observerImplA1 = new ObserverImplA();
        ObserverImplA observerImplA2 = new ObserverImplA();
        ObserverImplA observerImplA3 = new ObserverImplA();

        observableA.add(observerImplA1);
        observableA.add(observerImplA2);
        observableA.add(observerImplA3);

        observableA.notifyAllObservers();

        System.out.println(observerImplA1.getMyState());
        System.out.println(observerImplA2.getMyState());
        System.out.println(observerImplA3.getMyState());
    }
}
