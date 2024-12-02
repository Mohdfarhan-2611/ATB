package TaskPersonal.TaskPersonal_007;

public class Father extends GrandFather {

    int F = 10;

    public void FatherMethod()
    {
        System.out.println("Father");
    }

    public static void main(String[] args) {

        Object abc = new Father();
        //GrandFather obj = new Father();
        abc.hashCode();


        //Father obj = new Father();

    }
}
