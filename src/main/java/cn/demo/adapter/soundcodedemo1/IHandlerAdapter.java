package cn.demo.adapter.soundcodedemo1;

/**
 * 定义一个Adapter接口
 * @author Jjcc
 * @version 1.0.0
 * @Description
 * @ClassName HandlerAdapter.java
 * @createTime 2019年08月14日 22:30:00
 */
public interface IHandlerAdapter {

    /**
     * 给定处理程序事例，返回此HandlerAdapter是否支持它；
     * @title supports
     * @description
     * @author Jjcc
     * @param handler Controller对象
     * @return boolean
     * @createTime 2019/8/14 22:47
     * @throws
     */
    boolean supports(Object handler);

    /**
     * 使用给定的处理程序处理此请求。
     * @title handler
     * @description
     * @author Jjcc
     * @param handler Controller对象
     * @return void
     * @createTime 2019/8/14 22:51
     * @throws
     */
    void handler(Object handler);
}

/**
 * 多个Adapter实现类
 * @author Jjcc
 * @version 1.0.0
 * @Description
 * @ClassName HandlerAdapter.java
 * @createTime 2019年08月14日 22:54:00
 */
class SimpleHandlerAdapter implements IHandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return false;
    }

    @Override
    public void handler(Object handler) {

    }
}

class HttpHandlerAdapter implements IHandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return false;
    }

    @Override
    public void handler(Object handler) {

    }
}

class AnnotationHandlerAdapter implements IHandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return false;
    }

    @Override
    public void handler(Object handler) {

    }
}
