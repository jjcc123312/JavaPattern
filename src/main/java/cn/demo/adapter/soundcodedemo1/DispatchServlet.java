package cn.demo.adapter.soundcodedemo1;


import java.util.ArrayList;
import java.util.List;

/**
 * 前端控制器
 * @author Jjcc
 * @version 1.0.0
 * @Description
 * @ClassName DispatchServlet.java
 * @createTime 2019年08月14日 22:29:00
 */
public class DispatchServlet {

    private List<IHandlerAdapter> handlerAdapter = new ArrayList<IHandlerAdapter>() {
        {
            add(new SimpleHandlerAdapter());
            add(new HttpHandlerAdapter());
            add(new AnnotationHandlerAdapter());
        }
    };

    public  void doDispatch() {

    }

    public static void main(String[] args){
        new DispatchServlet().doDispatch();
    }

}
