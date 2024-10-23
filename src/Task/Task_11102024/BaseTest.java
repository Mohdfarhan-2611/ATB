package Task.Task_11102024;

public class BaseTest {

    private String name;
    private int id;

    public BaseTest()
    {
        System.out.println("DC- BaseTest");
    }

    public BaseTest(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("PC - Basetest "+ name +","+id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void PerformGet()
    {
        System.out.println("Get 200");
    }

    public void PerformPost()
    {
        System.out.println("Post");
    }

    public void PerformPatch()
    {
        System.out.println("Patch");
    }

    public void PerformPut()
    {
        System.out.println("Put");
    }

    public void delete()
    {
        System.out.println("delete");
    }
}
