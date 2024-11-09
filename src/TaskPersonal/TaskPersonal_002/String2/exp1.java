package TaskPersonal.TaskPersonal_002.String2;

public class exp1 {

    static void reverse(String inputString)
    {
        String reverse = "";
        int length = inputString.length();

        for(int i = length-1; i>=0; i--)
        {
            reverse = reverse + inputString.charAt(i);
        }

        System.out.println(reverse);

    }

    public static void main(String[] args) {

        reverse("Farhan");
    }
}
