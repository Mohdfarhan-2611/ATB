package Sept.Sept_23092024;

public class switchexm2 {
    public static void main(String[] args) {

        String browser = "Operamini";

        switch (browser)
        {
            case "chrome":
                System.out.println("Starting with chrome browser");
                break;
            case "Firefox":
                System.out.println("Starting with Firefox browser");
                break;
            case "Edge":
                System.out.println("Starting with Edge browser");
                break;
            default:
                System.out.println("Browser is not expected");
                break;
        }
    }
}
