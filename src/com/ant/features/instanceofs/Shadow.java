package com.ant.features.instanceofs;

/**
 * <p>
 * 影子变量
 * </p>
 *
 * @author Ant
 * @since 2021/12/7 5:53 下午
 */
public final class Shadow {
    private static final Rectangle rect = null;

    public static boolean isSquare(Shape shape) {
        if (shape instanceof Rectangle rect) {
            // Field rect is shadowed, local rect is in scope.
            System.out.println("This should be the local rect" + rect);
            return rect.length() == rect.width();
        }

        System.out.println("This should be the field rect" + rect);
        return shape instanceof Square;
    }

    public static boolean isSquare2(Shape shape) {
        if (!(shape instanceof Rectangle rect)) {
            // Field rect is in scope, local rect is not in scope here
            System.out.println("This should be the field rect: " + rect);
            return shape instanceof Square;
        }
        
        // Field rect is shadowed, local rect is in scope
        System.out.println("This should be the local rect: " + rect);
        return rect.length() == rect.width();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        isSquare(rectangle);
    }
}
