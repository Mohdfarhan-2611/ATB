package October.October_11102024_Encapsulation.Super.ex2;

public class Baseclass {

    //Encapsulation
    private String browser;

    //Default Constructor
    Baseclass()
    {
        System.out.println("DC - Baseclass");
    }

    //Parameterized Constructor
    Baseclass(String s)
    {
        System.out.println("PC- Baseclass");
    }

    //Getter
    public String getBrowser() {
        return browser;
    }

    //Setter
    public void setBrowser(String browser, boolean isAuth) {
        if(isAuth){
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }

    }


    void openBrowser(String browserName)
    {
        System.out.println("open browser "+ browserName);
    }

    void closeBrowser()
    {
        System.out.println("Close Browser");
    }
}
