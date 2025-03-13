package Coding4;

public class String1_Reverse {

    public static String reverse(String input)
    {
        int length = input.length();
        String reverse = "";
        for(int i=length-1; i>=0; i--)
        {
          reverse = reverse + input.charAt(i);
        }

        return reverse;

    }

    public static void main(String[] args) {

       String output = reverse("Farhan");
       System.out.println(output);
    }
}
