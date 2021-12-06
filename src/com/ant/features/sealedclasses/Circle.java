package com.ant.features.sealedclasses;

/**
 * <p>
 * 圆形
 * </p>
 *
 * @author Ant
 * @since 2021/12/6 5:00 下午
 */
public non-sealed class Circle extends Shape {

    protected Circle(String id) {
        super(id);
    }

    @Override
    public double area() {
        return 0;
    }
}
