public class Loop {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 1; i <= a; i++)
            System.out.println("For I=" + i);
        int i = 0;
        while (i++ < a) {
            int j = 1;
            while (j++ <= i) {
                System.out.print("*");
            }
            System.out.println("");
        }
        i = 0;
        do
            System.out.println("Do I=" + i++);
        while (i <= a);
        i = 1;
        for (; i <= 6;)
            System.out.println("For New: " + i++);
    }

}
