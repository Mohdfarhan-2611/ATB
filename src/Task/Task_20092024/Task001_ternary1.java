package Task.Task_20092024;

public class Task001_ternary1 {

    public static void main(String[] args) {

        int score = 90;
        String grade = score>=90 ? "grade A" : score>=80 ? "grade B" : score>=70 ? "grade C" : "grade D";
        System.out.println(grade);
    }
}
