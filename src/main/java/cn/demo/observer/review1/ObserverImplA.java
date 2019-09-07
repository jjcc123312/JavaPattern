package cn.demo.observer.review1;

/**
 * 观察者的具体构建类
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className ObserverImplA.java
 * @createTime 2019年09月05日 21:32:00
 */
public class ObserverImplA implements IObserver {

    private int myState;

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

    @Override
    public void update(BaseObservable baseObservable) {
        myState = ((ObservableA) baseObservable).getObjState();
    }
}
