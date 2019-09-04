package cn.demo.composite.review1;

/**
 * 组合模式：又叫部分整体模式。他创建了对象的树状结构，将对象组合成树状结构以表示“部分-整体”的层次关系；
 * 组合模式使得用户对单个对象和组合对象的访问具有一致性，即：组合能让客户已一致的方式处理单个对象和组合对象；
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className Client.java
 * @createTime 2019年09月03日 20:55:00
 */
public class Client {
    public static void main(String[] args) {
        //学校
        BaseOrganizationComponent university = new University("清华大学", "中国顶级大学");

        //学院
        BaseOrganizationComponent computerCollege = new College("计算机学院", " 计算机学院 ");
        BaseOrganizationComponent infoEngineerCollege = new College("信息工程学院", " 信息工程学院 ");

        university.add(computerCollege);
        university.add(infoEngineerCollege);

        computerCollege.add(new Department("通信工程", " 通信工程不好学 "));
        computerCollege.add(new Department("信息工程", " 信息工程好学 "));

        university.print();
    }
}
