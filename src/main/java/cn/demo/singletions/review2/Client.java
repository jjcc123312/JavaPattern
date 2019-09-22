package cn.demo.singletions.review2;


/**
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Client.java
 * @createTime 2019年09月19日 21:33:00
 */
public class Client {
    public static void main(String[] args){

        StaticInnerClassSingleton instance1 = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton instance2 = StaticInnerClassSingleton.getInstance();



//        DetectionSingleton instance1 = DetectionSingleton.getInstance();
//        DetectionSingleton instance2 = DetectionSingleton.getInstance();

//        LazySingleton instance1 = LazySingleton.getInstance();
//        LazySingleton instance2 = LazySingleton.getInstance();
//
        System.out.println(instance1 == instance2);

//        HungryTypeSingleton instance = HungryTypeSingleton.getInstance();
//        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)
//        ) {
//            objectOutputStream.writeObject(instance);
//
//            byte[] bytes = byteArrayOutputStream.toByteArray();
//
//            try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
//                 ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)){
//
//                HungryTypeSingleton o = (HungryTypeSingleton) objectInputStream.readObject();
//
//                System.out.println(instance == o);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
