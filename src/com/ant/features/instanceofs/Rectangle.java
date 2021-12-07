package com.ant.features.instanceofs;

/**
 * <p>
 * 长方形
 * </p>
 *
 * @author Ant
 * @since 2021/12/7 5:19 下午
 */
public class Rectangle implements Shape {

    /**
     * 长
     */
    private Long length;

    /**
     * 宽
     */
    private Long width;

    public Long width() {
        return this.width;
    }

    public Long length() {
        return this.length;
    }

    /**
     * <p>
     * 是否是正方形
     * </p>
     *
     * @param shape
     * @return boolean
     */
    public boolean isSquare(Shape shape) {
        if (shape instanceof Rectangle rect) {
            return (rect.length == rect.width);
        }
        return false;
    }

    /**
     * <p>
     * 是否是正方形
     * </p>
     *
     * @param shape
     * @return boolean
     */
    public boolean isSquare2(Shape shape) {
        if (!(shape instanceof Rectangle rect)) {
            return false;
        } else {
            return (rect.length == rect.width);
        }
    }


    /**
     * <p>
     * 匹配变量的作用域
     * </p>
     *
     * @param shape
     * @return boolean
     */
    public static boolean isSquareImplA(Shape shape) {
        if (shape instanceof Rectangle rect) {
            // rect is in scope
            return rect.length() == rect.width();
        }
        // rect is not in scope here
        return shape instanceof Square;
    }


    public static boolean isSquareImplB(Shape shape) {
        if (!(shape instanceof Rectangle rect)) {
            // rect is not in scope here
            return shape instanceof Square;
        }

        // rect is in scope
        return rect.length() == rect.width();
    }


    public static boolean isSquareImplC(Shape shape) {
        return shape instanceof Square ||  // rect is not in scope here
               (shape instanceof Rectangle rect &&
                rect.length() == rect.width());   // rect is in scope here
    }

    /**
     * <p>
     * 只有第一个运算不成立，也就是说类型不匹配时，才能进行下一步的运算。下一步的运算，匹配变量并没有被赋值，我们不能够在这一部分使用匹配变量。所以，这一段代码并不能通过编译器的审查。
     * </p>
     *
     * @param shape
     * @return boolean
     */
//    public static boolean isSquareImplD(Shape shape) {
//        return shape instanceof Square ||  // rect is not in scope here
//               (shape instanceof Rectangle rect ||
//                rect.length() == rect.width());   // rect is not in scope here
//    }

    /**
     * <p>
     * 位与运算符两侧的表达式都要参与计算。也就是说，不管位与运算符左侧的运算是否成立，
     * 位与运算符右侧的运算都要计算出来。换句话说，无论左侧的类型匹配不匹配，右侧的匹配变量都要使用。
     * 这就违反了匹配变量的作用域原则，编译器不能够确定匹配变量是否被赋值。所以，这一段代码，也不能通过编译器的审查。
     * </p>
     *
     * @param shape
     * @return boolean
     */
//    public static boolean isSquareImplE(Shape shape) {
//        return shape instanceof Square |  // rect is not in scope here
//               (shape instanceof Rectangle rect &
//                rect.length() == rect.width());   // rect is in scope here
//    }




}
