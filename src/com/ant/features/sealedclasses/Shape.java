package com.ant.features.sealedclasses;

/**
 * <p>
 * 功能描述
 * </p>
 *
 * @author Ant
 * @since 2021/12/6 5:01 下午
 */
public abstract sealed class Shape permits Circle, Square {
    public final String id;

    protected Shape(String id) {
        this.id = id;
    }

    public abstract double area();
}
