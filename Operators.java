public class Operators {
    public static void main(String[] args) {
        int num1 = 60;
        int num2 = 10;
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int rem = num1 % num2;
        // num1 = num1 + 2;
        num1 += 2;
        num1++; // post increment
        num1--;
        ++num1; // pre increment
        --num1;
        // num1 /= 2;
        System.out.println(num1 + "_" + sum + "_" + sub + "_" + mul + "_" + div + "_" + rem);
        /*
         * Assignment Operator
         * =
         * 
         * Arithmetic Operator
         * +,-,*,/,%
         * 
         * Conditional operator
         * <, >, ==, <=, >=, !=
         */
        int x = 6;
        int y = 7;
        boolean res = x > y;
        boolean res1 = x < y;
        boolean res2 = x == y;
        boolean res3 = x >= y;
        boolean res4 = x <= y;
        boolean res5 = x != y;
        boolean res6 = x > y || 1 < 3;
        System.out.println(res + " " + res1 + " " + res2 + " " + res3 + " " + res4 + " " + res5 + " " + res6);
    }
}
