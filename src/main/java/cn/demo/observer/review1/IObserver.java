package cn.demo.observer.review1;

/**
 * 观察者对象共有的接口
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className IObserver.java
 * @createTime 2019年09月05日 20:55:00
 */
public interface IObserver {

   /**
    * 观察者对象更新信息的方法
    * @title update
    * @description
    * @author Jjcc
    * @param baseObservable 封装信息的对象，参数类型为主题对象的父类
    * @return void
    * @createTime 2019/9/5 21:11
    * @throws
    */
    void update(BaseObservable baseObservable);
}
