package October.October_14102024_Abstraction.ex2;

public class Runner {

    public static void main(String[] args) {
        Son s1 = new Son();
        s1.Loan50K();
        s1.Loan25K();

        Father f = new Son();
        f.Loan25K();
        f.Loan50K();
    }
}
