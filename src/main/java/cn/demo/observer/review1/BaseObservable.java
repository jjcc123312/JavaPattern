package cn.demo.observer.review1;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题对象的父类
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className BaseObservable.java
 * @createTime 2019年09月05日 21:02:00
 */
public abstract class BaseObservable {

    /**
     * 观察者对象的集合；所有订阅了该主题的对象都会存入该集合中；
     * @title
     * @description
     * @author Jjcc
     * @return
     * @createTime 2019/9/5 21:08
     * @throws
     */
    private List<IObserver> list = new ArrayList<>();

    public void add(IObserver observer) {
        list.add(observer);
    }

    public void remove(IObserver observer) {
        list.remove(observer);
    }

    /**
     * 主题对象的通知方法，当主题对象发生改变时，通知所有的订阅者
     * @title notifyAllObservers
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/9/5 21:25
     * @throws
     */
    public void notifyAllObservers() {
        list.forEach(observer ->
            observer.update(this)
        );
    }

}
