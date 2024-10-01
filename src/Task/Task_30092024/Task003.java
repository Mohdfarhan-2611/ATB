package Task.Task_30092024;

public class Task003 {
    public static void main(String[] args) {

        String str = "PramodFarhan";
        int constant = 0;
        int vowels = 0;

        for (int i = 0; i < str.length(); i++)
        {
            System.out.println(str.charAt(i));
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                vowels++;
            } else
            {
                constant++;
            }
        }

        System.out.println("vowels are "+ vowels);
        System.out.println("constant are "+ constant);

    }
}
