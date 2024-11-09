package SelfPractice;

public class ClassTwo extends classone {


    int a = 11;
    String name = "Naveen";
    boolean isauth = true;

    public void check(int num, int abc, String abc1, boolean cond)
    {
        this.a= num;  //classtwo child variable
        super.a = abc; //classone Parent variable

        //System.out.println(num);
        //System.out.println(this.a);
        System.out.println(super.a);
    }


    public static void main(String[] args) {

        ClassTwo obj = new ClassTwo();
        obj.check(100, 11, "Farhan", true);
        System.out.println(obj.a);

    }
}
