/**
 * Data Types
 * 1=> Primitive
 * Integer [byte(1byte),short(2-byte),int(4-byte),long(8-byte)]
 * Float [double(8bytes),float(4bytes)]
 * character [char(2bytes)]
 * boolean [true,false]
 */
public class DataTypesPrimitive {
    public static void main(String[] args) {
        byte num1 = 2;
        byte num2 = 7;
        int sum = num1 + num2;
        short sh = 554;
        long lg = 234l;
        float fl1 = 3.4f;
        double d1 = 3.4;
        char ch1 = 'N';
        boolean b1 = true;
        System.out.println(num1 + "+" + num2 + "=" + sum);
        System.out.println(fl1 + "," + ch1 + ",sh" + sh + "," + lg + "," + d1 + "," + b1);
    }
}