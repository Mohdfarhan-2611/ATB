package October.October_04102024_Constructor;

public class Lab004 {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("Farhan");
        System.out.println("Name is "+ p2.name);
        Person p3 = new Person(true);
        System.out.println("Married Status " +p3.is_married);
        Person p4 = new Person(30, 2, 2);
        System.out.println("Age is " +p4.age);
        System.out.println("Hands are "+p4.hands);
        System.out.println("Legs are "+p4.legs);
        Person p5 = new Person("Male", "Not disabled", "brown eyes", "black hair", "Software Tester");
        System.out.println("Sex is "+p5.sex);
        System.out.println("Is disabled "+p5.disability);
        System.out.println("eyes color are " + p5.eyes_color);
        System.out.println("hair color are "+p5.hair_color);
        System.out.println("Occupation isv "+p5.occupation);



    }
}
