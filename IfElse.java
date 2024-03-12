public class IfElse {
    public static void main(String[] args) {
        int age = 2;
        if (age >= 18)
            System.out.println("you are adult!");
        else if (age < 10)
            System.out.println("you are  Child!");
        else
            System.out.println("you are not adult!");
        // Ternary Operate
        int res = age > 18 ? 1 : 0;
        System.out.println("you are" + (res == 1 ? " adult" : " not adult") + "!");

    }
}
