package com.ant.features.record;

import com.ant.features.record.normal.Circle;

/**
 * <p>
 * Circle 实例对象比对
 * </p>
 *
 * @author Ant
 * @since 2021/12/6 11:20 上午
 */
public class ImmuteUseCases {

    public static void main(String[] args) {
        normalCircle();
    }


    /**
     * 传统定义方式对象比对
     */
    public static void normalCircle() {
        Circle c1 = new Circle(10.0);
        Circle c2 = new Circle(10.0);

        System.out.println("Equals? " + c1.equals(c2));
    }

}
