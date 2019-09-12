package cn.demo.strategy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * JDK-策略模式源码分析
 * @author Jjcc
 * @version 1.0.0
 * @description
 * @className SoundCodeDemo1.java
 * @createTime 2019年09月09日 22:15:00
 */
public class SoundCodeDemo1 {

    public static void main(String[] args) {
        Integer[] data = { 9, 1, 2, 8, 4, 3 };

        Arrays.sort(data);
//
//        System.out.println(Arrays.toString(data));
//
//        new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        };

        Arrays.sort(data, (val1, val2) -> {
            if (val1 > val2) {
                return -1;
            } else {
                return 1;
            }
        });

        System.out.println(Arrays.toString(data));
    }


}
