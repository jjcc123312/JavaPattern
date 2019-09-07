package cn.demo.observer.review1;

/**
 * 观察者模式：当一个（Subject或者Observable）对象的状态发生改变时，其相关依赖对象（Observer）都会收到通知并且被自动更新；
 * 观察者模式就是1：N的模式，主题对象就是那个1，N是订阅者，又称之为观察者对象；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Client.java
 * @createTime 2019年09月05日 20:48:00
 */
public class Client {
    public static void main(String[] args) {
        //主题类
        ObservableA observableA = new ObservableA();

        observableA.setObjState(222);

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

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
        observableA.setObjState(333);

        observableA.notifyAllObservers();

        System.out.println(observerImplA1.getMyState());
        System.out.println(observerImplA2.getMyState());
        System.out.println(observerImplA3.getMyState());
    }
}
