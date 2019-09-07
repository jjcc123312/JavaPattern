package cn.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Observable：主题类，相当于气象站发布的气象信息封装成的对象。
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className IObservable.java
 * @createTime 2019年09月04日 22:41:00
 */
public abstract class Observable {

    /**
     * 观察者集合
     * @title
     * @description
     * @author Jjcc
     * @return
     * @createTime 2019/9/4 22:58
     * @throws
     */
    private List<IObserver> observerList = new ArrayList<>();


    public void add(IObserver iObserver) {
        observerList.add(iObserver);
    }

    public void remove(IObserver iObserver) {
        observerList.remove(iObserver);
    }

    /**
     * 通知所有的观察者更新状态
     * @title notifyAllObservers
     * @description
     * @author Jjcc
     * @return void
     * @createTime 2019/9/4 23:06
     * @throws
     */
    public void notifyAllObservers(){
        for (IObserver obs : observerList) {
            obs.update(this);
        }
    }

}
