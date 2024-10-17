package TaskPersonal.TaskPersonal_002;

public class Java002 {

    String name;  //Instance variable

    public void details() //Instance Method
    {
        name = "Farhan";  //Instance variable
       // System.out.println(name);
    }

    public static void main(String[] args) {  //Static Method

        //System.out.println(name);
        Java002 j = new Java002();
        j.details();
        System.out.println(j.name);
    }
}
