package October.October_11102024_Encapsulation.ex4;

public class Runner {
    public static void main(String[] args) {

        boolean isAdmin = true;
        Bank bnk = new Bank(1234567890, "Farhan");
        System.out.println(bnk.getAccountnumber());
        System.out.println(bnk.getAccountname(isAdmin));
        bnk.setAccountname("Tayyab", isAdmin);
        System.out.println(bnk.getAccountname(isAdmin));




    }
}
