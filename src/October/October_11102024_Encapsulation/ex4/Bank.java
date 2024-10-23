package October.October_11102024_Encapsulation.ex4;

public class Bank {

    private String accountname;
    private long accountnumber;
   // String name;

    public Bank(long accountnumber, String accountname)
    {
        this.accountnumber = accountnumber;
        this.accountname = accountname;
    }

    public String getAccountname(boolean isAdmin)
    {
        if(isAdmin)
        {
        return accountname;
        }
        else
        {
            return null;
        }
    }

    public void setAccountname(String accountname, boolean isAdmin)
    {
        if (isAdmin)
        {
            this.accountname = accountname;
            System.out.println("Allowed");
        }
        else {
            System.out.println("Not allowed");
        }
    }

    public Long getAccountnumber()
    {
        return accountnumber;
    }

    public void setAccountnumber(Long accountnumber)
    {
        this.accountnumber = accountnumber;
    }
}
