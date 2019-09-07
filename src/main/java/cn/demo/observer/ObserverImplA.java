package cn.demo.observer;

/**
 * 观察者类的具体构建角色
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className ObserverA.java
 * @createTime 2019年09月04日 22:53:00
 */
public class ObserverImplA implements IObserver {

    private int myState;

    @Override
    public void update(Observable observable) {
        int state = ((ObservableA) observable).getState();
        myState = state;
    }

    public int getMyState() {
        return myState;
    }
    public void setMyState(int myState) {
        this.myState = myState;
    }
}
