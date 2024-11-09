package October.October_18102024_Strings.ex2;

public class ATB1 {
    public static void main(String[] args) {
        String s = "Farhan";
        String rev = "";

        for(int i=s.length()-1; i>=0; i--)
        {
            rev = rev + s.charAt(i);
        }

        System.out.println(rev);


    }
}
