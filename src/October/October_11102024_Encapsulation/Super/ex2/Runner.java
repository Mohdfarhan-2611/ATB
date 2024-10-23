package October.October_11102024_Encapsulation.Super.ex2;

public class Runner {
    public static void main(String[] args) {

        Baseclass t1 = new TestCase1();
        t1.openBrowser("edge");
        t1.closeBrowser();
        System.out.println(t1.getBrowser());
    }
}
