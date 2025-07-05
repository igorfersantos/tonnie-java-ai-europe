//TIP To <b>Run</b> code_ press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         Keywords
         https://en.wikipedia.org/wiki/List_of_Java_keywords
         Primitive Types
         https://en.wikibooks.org/wiki/Java_Programming/Primitive_Types
         https://www.dio.me/articles/java-tipos-primitivos
        */

        byte b = 127;
        char c = 'A';
        char ch = 65;
        short s = 32767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807L;
        float f =  3.4028235E38f;
        double d = 1.7976931348623157E308;
        boolean bool = false;
        // void represents a non-existent value. Or the absense of value

        System.out.println("Primitive Variables:");
        System.out.println("byte b = " + b);
        System.out.println("char c = '" + c + "'");
        System.out.println("char ch = '" + ch + "'");
        System.out.println("short s = " + s);
        System.out.println("int i = " + i);
        System.out.println("long l = " + l);
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);
        System.out.println("boolean bool = " + bool);

    }
}