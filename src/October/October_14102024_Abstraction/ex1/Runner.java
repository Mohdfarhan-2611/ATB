package October.October_14102024_Abstraction.ex1;

public class Runner {

    public static void main(String[] args) {

        ChromeT_C ch = new ChromeT_C();
        ch.openBrowser("Chrome");
        ch.closeBrowser("Chrome");
        ch.takescreenhot();


        FireFoxT_C fx = new FireFoxT_C();
        fx.openBrowser("Firefox");
        fx.closeBrowser("Firefox");
        fx.takescreenhot();

    }
}
