package October.October_04102024_Constructor;

public class AHuman {
    String eyes_color;
    String name1 = "Planet";
    String name2;
    long aadhar_number;

    AHuman()
    {
        System.out.println("Object created, Default Constructor Called");
    }

    AHuman(String name)
    {
        System.out.println("This is parameterized constructor");
        this.name2 = name;
        System.out.println(name);
    }

    void walk()
    {
        System.out.println("Walking");
    }

    int talk()
    {
      return 10;
    }

    String sleep(String name)
    {
        System.out.println("Sleeping");
        return "I am sleeping";
    }

    void eat(String name)
    {
        System.out.println("Eating");
    }

    public static void main(String[] args) {






    }


}
