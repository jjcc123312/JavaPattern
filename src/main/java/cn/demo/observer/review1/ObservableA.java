package cn.demo.observer.review1;

/**
 * 主题类的具体构建角色
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className ObservableImplA.java
 * @createTime 2019年09月05日 21:28:00
 */
public class ObservableA extends BaseObservable {

    private int objState;

    public int getObjState() {
        return objState;
    }

    public void setObjState(int objState) {
        this.objState = objState;
    }


}
