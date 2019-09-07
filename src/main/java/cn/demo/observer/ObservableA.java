package cn.demo.observer;

/**
 * 主题类的具体构建类
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className ObservableA.java
 * @createTime 2019年09月04日 23:08:00
 */
public class ObservableA extends Observable {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
