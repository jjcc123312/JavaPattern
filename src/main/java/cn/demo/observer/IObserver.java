package cn.demo.observer;

/**
 * Observer：观察者；相当于气象局天气信息的订阅者。
 * @author Jjcc
 * @version 1.0.0
 * @description 抽象构建角色
 * @className Observer.java
 * @createTime 2019年09月04日 22:43:00
 */
public interface IObserver {

    /**
     * 观察者接收到信息后调用的方法。
     * @title update
     * @description
     * @author Jjcc
     * @param observable 主题对象
     * @return void
     * @createTime 2019/9/4 22:47
     * @throws
     */
    void update(Observable observable);
}
