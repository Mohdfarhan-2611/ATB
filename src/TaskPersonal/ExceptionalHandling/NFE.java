package TaskPersonal.ExceptionalHandling;

public class NFE {

    public static void main(String[] args) {

        String str = "123";
        int a = Integer.parseInt(str);
        System.out.println(a);

//        try
//        {
//            int a = Integer.parseInt(str);
//        }
//        catch (NumberFormatException e)
//        {
//            System.out.println("string cannot be parse into integer");
//        }

    }
}
