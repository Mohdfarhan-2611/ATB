package October.October_09102024_Polymorphism.methodoverriding;

public class runner {

    public static void main(String[] args) {

        Son s = new Son();
        s.home();

        Father f = new Father();
        f.home();

       // Dynamic Dispatch
        Father fs = new Son();
        fs.home();

        //Not Possible
        // Son sf = new Father();


    }
}
