package cn.demo.strategy;


/**
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Demo.java
 * @createTime 2019年09月09日 22:17:00
 */
@FunctionalInterface
public interface Demo<T> {

    int method1(T t1, T t2);

    @Override
    boolean equals(Object obj);

}
