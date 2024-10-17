package October.October_09102024_Inheritance.Singlelevel.ex2;

public class Daughter extends Father {

      Daughter()
      {
          pension = 10000;
          house = 5;
          policy= "Aditya Birla";

          child();
          int daughter_pension = father_pension(pension);
          System.out.println(daughter_pension);
          int daughter_house = father_house(house);
          System.out.println(daughter_house);
          String daughter_policy = father_policy(policy);
          System.out.println(daughter_policy);

      }

}
