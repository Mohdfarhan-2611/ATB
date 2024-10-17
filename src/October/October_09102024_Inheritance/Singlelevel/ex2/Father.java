package October.October_09102024_Inheritance.Singlelevel.ex2;

public class Father {

    int pension;
    int house;
    String policy;


    Father()
    {
        System.out.println("Father DC for himself");
    }

    void child()
    {
        System.out.println("Function has 1 daughter");
    }

    int father_pension(int pension){

        this.pension = pension;
        return pension;
    }

    int father_house(int house)
    {
        this.house = house;
        return house;
    }

    String father_policy(String policy)
    {
        this.policy = policy;
        return policy;
    }


}
