package com.ant.features.sealedclasses;

/**
 * <p>
 * 正方形
 * </p>
 *
 * @author Ant
 * @since 2021/12/6 5:00 下午
 */
public non-sealed class Square extends Shape{

    protected Square(String id) {
        super(id);
    }

    @Override
    public double area() {
        return 0;
    }
}
