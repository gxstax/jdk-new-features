package com.ant.features.record.normal;

/**
 * <p>
 * 传统的圆形
 * </p>
 *
 * @author Ant
 * @since 2021/12/6 10:06 上午
 */
public class Circle implements Shape {

    /**
     * 半径
     */
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
