public class Switch {
    public static void main(String[] args) {
        int day = 2;
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
