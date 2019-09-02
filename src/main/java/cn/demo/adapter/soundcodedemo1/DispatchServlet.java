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

    public void doDispatch() {
//        SimpleControllerImpl controller = new SimpleControllerImpl();
//        HttpControllerImpl controller = new HttpControllerImpl();
        AnnotationControllerImpl controller = new AnnotationControllerImpl();
        IHandlerAdapter handler = getHandler(controller);
        handler.handler(controller);
    }

    public IHandlerAdapter getHandler(IController controller){
        IHandlerAdapter ia = null;
        for (IHandlerAdapter iHandlerAdapter : handlerAdapter) {
            if (iHandlerAdapter.supports(controller)) {
                ia = iHandlerAdapter;
            }
        }
        return ia;
    }

    public static void main(String[] args){
        new DispatchServlet().doDispatch();
    }

}
