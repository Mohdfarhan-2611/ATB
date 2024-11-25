package TaskPersonal.TaskPersonal_005.Encapsulation;

public class Customer {

    public static void main(String[] args) {
        Bank valid = new Bank(1);
        valid.setAccountbalance(2);
        System.out.println(valid.getAccountbalance());



//        Bank invalid = new Bank(false);
//        invalid.setAccountbalance(50000);
//        Bank Farhan = new Bank(true);
//        Farhan.setAccountbalance(50000);
//        System.out.println(Farhan.getAccountbalance());
    }

}
