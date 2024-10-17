package October.October_04102024_Constructor;

public class Lab001 {
    public static void main(String[] args) {

        AHuman h = new AHuman(); //Object created, Default Constructor Called
        System.out.println(h.name1);
        AHuman h1 = new AHuman("Farhan");    //Object created, Constructor Called
        System.out.println(h1.name1);
        new AHuman();
        new AHuman("Anam"); //Object created, Constructor Called

    }
}
