package cn.demo.singletions;

/**
 * 枚举方式实现
 * Create by Jjcc on 2019/6/30 13:43
 *
 * @author Jjcc
 */
public enum SingletonDemo5 {

    /**
     * 实例对象
     */
//    RED(1),GREEN(2),BLUE(3);

    INSTANCE;

    public void getMethod() {
        System.out.println(1);
    }

//    private int code;
//    SingletonDemo5(int code){
//        this.code=code;
//    }
//    public int getCode(){
//        return code;
//    }
}

class Test {
    public static void main(String[] args){
//        SingletonDemo5 instance = SingletonDemo5.BLUE;
//        System.out.println(instance.getCode());

        SingletonDemo5 instance = SingletonDemo5.INSTANCE;
        System.out.println(instance.hashCode());
    }
}
