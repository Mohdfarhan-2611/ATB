package October.October_14102024_Abstraction.ex1;

public class FireFoxT_C extends  Base{

    @Override
    void openBrowser(String Browser){
        System.out.println("Open Browser "+Browser);
    }

    @Override
    void closeBrowser(String Browser){
        System.out.println("Close Browser "+Browser);
    }

}
