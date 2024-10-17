package October.October_04102024_Constructor;

public class Lab003 {
    public static void main(String[] args) {

        Car dc = new Car();
        Car b = new Car("Ford");
        System.out.println(b.name);
        System.out.println(b.color);
        System.out.println(b.seats);
        System.out.println(b.Engine);
        Car c = new Car("Tata", "Red", 7, "petrol");
        System.out.println(c.name);
        System.out.println(c.color);
        System.out.println(c.seats);
        System.out.println(c.Engine);
    }
}
