package October.October_11102024_Encapsulation.ex3;

public class Runner {

    public static void main(String[] args) {

        Website2 w2 = new Website2("Admin", "Password@123");
        String u = w2.getUsername();
        System.out.println(u);
        w2.setUsername("Admin23");
        String u2 =  w2.getUsername();
        System.out.println(u2);

        String p = w2.getPassword();
        System.out.println(p);
        w2.setPassword("Admin@123");
        String p2 = w2.getPassword();
        System.out.println(p2);
    }
}
