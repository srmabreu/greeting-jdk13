package com.features;

public class TextBlock {

    public static void main(String[] args) {
        String textBlock = """
                        Hi
                        Hello
                        Yes""";

        String str = "Hi\nHello\nYes";

        System.out.println("Text Block String:\n" + textBlock);
        System.out.println("Normal String Literal:\n" + str);

        System.out.println("Text Block and String literal equals Comparison: " + (textBlock.equals(str)));
        System.out.println("Text Block and String literal == Comparison: " + (textBlock == str));
    }

}
