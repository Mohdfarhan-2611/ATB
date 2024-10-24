package Task.Task_18102024;

public class Task2 {

    public static void main(String[] args) {

        String s = "Pramod";
        String rev = "";

        for(int i=s.length()-1; i>=0; i--)
        {
             rev = rev + s.charAt(i);
        }

        System.out.println(rev);


    }

}
