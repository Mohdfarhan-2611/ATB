package TaskPersonal.TaskPersonal_006;

public class exp1_ReverseString {

    public static void main(String[] args) {

        reverseString("Farhan");
    }

    static void reverseString(String inputString)
    {
        int length = inputString.length();
        String reverse = "";

        for(int i =length-1; i>=0; i--)
        {
            reverse = reverse + inputString.charAt(i);
        }

        System.out.println(reverse);
    }
}
