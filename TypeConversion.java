/**
 * TypeConversion
 */
public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        int tp = b * b;// type promotion
        int a = 12;
        int sum = a + b;
        // b=a; error
        b = (byte) a;// Explicit Conversion
        a = b;// implicit Conversion
        float x = 2.3f;
        int y = (int) x;
        b = 127;
        a = 256;
        b = (byte) a;
        System.out.println(sum + "," + a + "," + b + "," + x + "," + y + "," + tp);
    }
}