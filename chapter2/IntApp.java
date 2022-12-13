package gr.aueb.cf.chapter2;

/**
 * Int datatype in Java
 */
public class IntApp {
    public static void main(String[] args) {
        System.out.printf("Integer  Type: %s, Size: %d bits, Min: %d, Max: %d\n ",
                Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.printf("Long     Type: %s, Size: %,d bits, Min: %,d, Max: %,d\n ",
                Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.printf("Short    Type: %s, Size: %,d bits, Min: %,d, Max: %,d\n ",
                Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.printf("Byte     Type: %s, Size: %d bits, Min: %d, Max: %d\n ",
                Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
    }
}
