package lesson04.code.primitive;

public class CastVariable {
    public static void main(String[] args) {

        // автоматическое (неявное) приведение типов

        byte xByte = 10;

        short xShort = xByte;

        System.out.println(xShort);

        int xInt = xByte;

        System.out.println(xInt);

        // явное приведение типов


        int yInt = 257; // 0000 0001 0000 0001

        byte yByte = (byte) yInt;

        System.out.println(yByte);

    }
}
