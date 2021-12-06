package com.ant.features.record;

import com.ant.features.record.normal.Shape;

import java.util.Objects;

/**
 * <p>
 * 档案类（圆）
 * </p>
 *
 * @author Ant
 * @since 2021/12/6 11:15 上午
 */
public record Circle(double radius) implements Shape {

    public Circle {
        if (radius < 0) {
            throw new IllegalArgumentException("The radius of a circle cannot be negative [" + radius + "]");
        }
    }

    @Override
    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * <p>
     * 可以重新（但是不推荐）
     * </p>
     *
     * @param obj
     * @return boolean
     */
    @Deprecated
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Circle other) {
            return other.radius == this.radius;
        }
        return false;
    }

    /**
     * <p>
     * 可以重新（但是不推荐）
     * </p>
     *
     * @param
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return String.format("Circle[radius=%f]", radius);
    }
}
