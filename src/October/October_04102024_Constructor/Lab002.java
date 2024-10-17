package October.October_04102024_Constructor;

public class Lab002 {
    public static void main(String[] args) {

        Dog Jd = new Dog();
        Dog gs = new Dog("German Shefford");
        System.out.println(gs.breed);
        System.out.println(gs.name);
        System.out.println(gs.legs);
        System.out.println(gs.age);
        Dog bd = new Dog("Tommy", "Bull Dog", 5, 4);
        System.out.println(bd.name);
        System.out.println(bd.breed);
        System.out.println(bd.age);
        System.out.println(bd.legs);
    }
}
