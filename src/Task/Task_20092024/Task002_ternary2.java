package Task.Task_20092024;

public class Task002_ternary2 {
    public static void main(String[] args) {

        int a = 60;
        int b = 50;
        int c = 45;
        int max = a>b ? (a>c ? a : c) : b>c ? b :c;
        System.out.println(max);
    }
}
