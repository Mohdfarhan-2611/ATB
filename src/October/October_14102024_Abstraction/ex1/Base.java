package October.October_14102024_Abstraction.ex1;

public class Base extends GrandBase {
    //Web Automation
    //Single
    //Hide the functionality of open and close Browser

    void openBrowser(String browser){}
    void closeBrowser(String browser){}


    @Override
    void takescreenhot() {
        System.out.println("Take screenshot");
    }
}
