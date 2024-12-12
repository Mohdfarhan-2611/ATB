package November.November2;

public class Stringexp1 {

    public static void ReverseString(String inputString)
    {
        String reverse = " ";
        try
        {
            for (int i = inputString.length()-1; i >= 0; i--) {
                reverse = reverse + inputString.charAt(i);
            }
            System.out.println(reverse.trim());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        ReverseString("Hello World");
    }
}
