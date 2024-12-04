package TaskPersonal.TaskPersonal_008;

public class String_1 {

    public static void Reverse(String inputString)
    {
        String reverse= "";

        for(int i =inputString.length()-1; i>=0; i--)
        {
            reverse = reverse + inputString.charAt(i);
        }

        System.out.println(reverse);
    }


    public static void main(String[] args) {

        Reverse("My name is Tayyab");
    }
}
