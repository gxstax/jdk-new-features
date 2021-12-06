package com.ant.features.record.normal;

/**
 * <p>
 * 正方形
 * </p>
 *
 * @author Ant
 * @since 2021/12/6 11:01 上午
 */
public final class Square implements Shape {

    public final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea(double radius) {
        return side * side;
    }

}
