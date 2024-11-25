package TaskPersonal.TaskPersonal_005.Encapsulation;

import java.sql.SQLOutput;

public class Login {

    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String password, String username) {
        if(username.equals(getUsername()))
        {
            this.password = password;
            System.out.println("Password has been changed successfully");
        }
        else
        {
            System.out.println("username is not valid");
        }
    }
}
