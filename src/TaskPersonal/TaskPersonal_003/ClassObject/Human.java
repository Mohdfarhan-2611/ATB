package TaskPersonal.TaskPersonal_003.ClassObject;

public class Human {
    //Class is a blueprint, here we have human class blueprint
    //These are the attributes of the class
    //It is not a real time entity
    //No memory allocated when class is created

    String name;
    int age;
    String gender;
    double height;
    double weight;

    //These are the behaviour of the class
    void walk()
    {
        System.out.println("This human can walk");
    }

    void sleep()
    {
        System.out.println("This human can sleep");
    }



    public static void main(String[] args) {

        //Instance of class
        //we can create multiple objects using class blueprint.
        //it is real time entity
        //Memory is allocated when the object is created
        Human h1 = new Human();
        h1.name= "Farhan";
        h1.age= 30;
        h1.height = 5.2;
        h1.weight = 62.7;
        h1.gender = "Male";
        h1.walk();
        h1.sleep();


        Human h2 = new Human();
        h2.name = "Anam";
        h2.age = 25;
        h2.height = 6.1;
        h2.weight = 70;
        h2.gender = "Female";
        h2.sleep();
        h2.walk();
    }
}
