package cn.demo.singletions.review;

/**
 * Create by Jjcc on 2019/7/9 23:41
 *
 * @author Jjcc
 */
public class Client1 {
    public static void main(String[] args) throws NoSuchMethodException {
        //枚举方式
//        EnumSingletonDemo1 instance1 = EnumSingletonDemo1.INSTANCE;
//        EnumSingletonDemo1 instance2 = EnumSingletonDemo1.INSTANCE;
//        System.out.println(instance1.hashCode());
//        System.out.println(instance2.hashCode());

        EnumSingletonDemo1 instancEaccept = EnumSingletonDemo1.INSTANCEaccept;



        //静态内部类
//        StaticInnerClassSingletonDemo1 instance1 = StaticInnerClassSingletonDemo1.getInstance();
//        StaticInnerClassSingletonDemo1 instance2 = StaticInnerClassSingletonDemo1.getInstance();
//        System.out.println(instance1.hashCode());
//        System.out.println(instance2.hashCode());

//        try {
//            Class<?> aClass = Class.forName("cn.demo.singletions.review.StaticInnerClassSingletonDemo1");
//            Constructor<?> constructor = aClass.getDeclaredConstructor(null);
//            constructor.setAccessible(true);
//            StaticInnerClassSingletonDemo1 o = (StaticInnerClassSingletonDemo1) constructor.newInstance(null);
//            System.out.println(o.hashCode());
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }

//        System.out.println(Test2.a);

        //懒汉式
//        LazySingletonDemo1 instance1 = LazySingletonDemo1.getInstance();
//        LazySingletonDemo1 instance2 = LazySingletonDemo1.getInstance();
//
//        System.out.println(instance1);
//        System.out.println(instance2);
//
//        //反序列化创建实例类；
//        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
//             ) {
//            objectOutputStream.writeObject(instance1);
//
//            byte[] bytes = byteArrayOutputStream.toByteArray();
//            try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
//                 ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
//                 ) {
//                LazySingletonDemo1 o = (LazySingletonDemo1) objectInputStream.readObject();
//                System.out.println(o);
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        饿汉式
//        EagerSingletonDemo1 instance1 = EagerSingletonDemo1.getInstance();
//        EagerSingletonDemo1 instance2 = EagerSingletonDemo1.getInstance();
//        System.out.println(instance1.hashCode());
//        System.out.println(instance2.hashCode());

//        try {
//            Class<?> aClass = Class.forName("cn.demo.singletions.review.EagerSingletonDemo1");
////            EagerSingletonDemo1 o = (EagerSingletonDemo1) aClass.newInstance();
//
//            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(null);
//            declaredConstructor.setAccessible(true);
//            EagerSingletonDemo1 o = (EagerSingletonDemo1) declaredConstructor.newInstance(null);
//            System.out.println(o.hashCode());
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
    }
}

class Test2{
    public final static String a = null;

    static {
        System.out.println("OK");
    }

    public Test2() {
        System.out.println(1111);
    }

}