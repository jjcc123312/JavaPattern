package cn.demo.adapter.soundcodedemo1;

/**
 * Controller接口
 * @author Jjcc
 * @version 1.0.0
 * @Description
 * @ClassName Controller.java
 * @createTime 2019年08月14日 22:29:00
 */
public interface IController {

}

class SimpleControllerImpl implements IController {
    public void simpleHandler() {
        System.out.println("simpleHandler...");
    }
}

class HttpControllerImpl implements IController {
    public void httpHandler() {
        System.out.println("httpHandler...");
    }
}

class AnnotationHandlerImpl implements IController {
    public void annotationHandler() {
        System.out.println("annotationHandler...");
    }
}
