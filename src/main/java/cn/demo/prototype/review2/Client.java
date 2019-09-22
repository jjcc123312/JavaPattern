package cn.demo.prototype.review2;

import java.io.*;

/**
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Client.java
 * @createTime 2019年09月22日 17:31:00
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeDemo1 pro1 = new PrototypeDemo1("张三", new PrototypeDemo2(22), 123);

        System.out.println(pro1);


        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)
        ) {

            objectOutputStream.writeObject(pro1);



            try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                  ObjectInputStream objectInputStream =  new ObjectInputStream(byteArrayInputStream)) {

                PrototypeDemo1 o = (PrototypeDemo1) objectInputStream.readObject();

                o.getPrototypeDemo2().setAge(23);

                System.out.println(o);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

//        PrototypeDemo1 clone = (PrototypeDemo1) pro1.clone();
//
//        System.out.println(clone);
//
//        System.out.println(pro1.getName() == clone.getName());
//
//        clone.setName("李四");
//        clone.getPrototypeDemo2().setAge(23);
//        clone.setProd(11111);
//
//        System.out.println(pro1);
//        System.out.println(clone);
    }
}
