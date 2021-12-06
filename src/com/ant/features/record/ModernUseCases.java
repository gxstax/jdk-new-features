package com.ant.features.record;

/**
 * <p>
 * 档案类实例比对
 * </p>
 *
 * @author Ant
 * @since 2021/12/6 11:23 上午
 */
public class ModernUseCases {

    public static void main(String[] args) {
        recordCircle();
    }

    /**
     * 档案类对象比对
     */
    public static void recordCircle() {
        Circle c1 = new Circle(10.0);
        Circle c2 = new Circle(10.0);

        System.out.println("Equals? " + c1.equals(c2));
    }
}
