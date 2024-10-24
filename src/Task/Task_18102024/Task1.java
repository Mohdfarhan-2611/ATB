package Task.Task_18102024;

public class Task1 {
    public static void main(String[] args) {

        String s = "Pramod Dutta";
        System.out.println(s.length());

        char[] ch = s.toCharArray();

        int count = 0;
        for(char c : ch)
        {
            count++;
        }

        System.out.println(count);

    }


}
