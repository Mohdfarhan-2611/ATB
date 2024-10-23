package October.October_11102024_Encapsulation.Super.ex2;

public class TestCase1 extends  Baseclass
{
    //TestCase1 is a type of Inheritance -- Single Inheritance

    TestCase1()
    {
        super();      //DC of Baseclass
        System.out.println("DC- Testcase1");
        this.setBrowser("Chrome", true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
         super.setBrowser(browser, isAuth);
       }

 }


