package com.ant.features.textblocks;

/**
 * <p>
 * java新特性-文字块
 * </p>
 *
 * @author Ant
 * @since 2021/12/3 3:44 下午
 */
public class TextBlocks {

    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }

    public static void demo1() {
        String stringBlock =
                "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "    <body>\n" +
                        "        <h1>\"Hello World!\"</h1>\n" +
                        "    </body>\n" +
                        "</html>\n";

        String textBlock = """
        <!DOCTYPE html>
        <html>
            <body>
                <h1>"Hello World!"</h1>
            </body>
        </html>
        """;

        System.out.println(
                "Does the text block equal to the regular string? " +
                        stringBlock.equals(textBlock));
        System.out.println(
                "Does the text block refer to the regular string? " +
                        (stringBlock == textBlock));
    }


    public static void demo2() {
        int stringSize = """
        <!DOCTYPE html>
        <html>
            <body>
                <h1>"Hello World!"</h1>
            </body>
        </html>
        """.length();

        System.out.println(stringSize);
    }

    public static void demo3() {

        String greetingHtml = """
        <!DOCTYPE html>
        <html>
            <body>
                <h1>%s</h1>
            </body>
        </html>
        """.formatted("Hello World!");

        System.out.println(greetingHtml);
    }

}
