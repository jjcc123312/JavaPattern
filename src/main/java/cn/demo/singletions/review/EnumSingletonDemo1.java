package main.java.cn.demo.singletions.review;

/**
 * 单例模式-枚举
 * 线程安全的；调用效率高；无法实现延时加载；枚举天然的防止反射和反序列化的漏洞；
 * Create by Jjcc on 2019/7/10 23:03
 *
 * @author Jjcc
 */
public enum EnumSingletonDemo1 {

    INSTANCEaccept("Java"),SDAsdasd("A","B", 3),ASDASD;

    EnumSingletonDemo1(String java) {
        System.out.println("1111111");
    }

    EnumSingletonDemo1(String a, String b, int i) {

    }

    EnumSingletonDemo1() {

    }

    public void singletonOperation() {
        System.out.println(111);
    }

}
