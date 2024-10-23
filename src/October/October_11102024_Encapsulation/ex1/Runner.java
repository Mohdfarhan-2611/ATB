package October.October_11102024_Encapsulation.ex1;

public class Runner {

    public static void main(String[] args) {

        Web w = new Web("admin", "Pass123@");
        System.out.println(w.username);
        System.out.println(w.password);
        w.password= "admin123@";
        System.out.println(w.password);
    }
}
