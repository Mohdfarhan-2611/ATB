package TaskPersonal.ExceptionalHandling;

public class Null_E {

    public static void main(String[] args) {

        String str = null;

        try
        {
            System.out.println(str.toUpperCase());
        }
        catch (NullPointerException n)
        {
            System.out.println("cant uppercase null");;
        }
    }
}
