package main.java.cn.demo.prototype;


/**
 * Create by Jjcc on 2019/7/4 22:38
 *
 * @author Jjcc
 */
public class PrototypeDemo1 {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setName("Jjcc");
        person1.setSex("men");

//        Person clone = (Person) person1.clone();

//        System.out.println(clone.toString());

        Person person2 = person1;

        System.out.println(person1 == person2);

        person2.setName("Jc");

        System.out.println(person1 == person2);

        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
    }
}

class Person implements Cloneable{
    private String name;

    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
