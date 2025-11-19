package main.java.com.kusuma.oops.encapsulation;

public class UserProfile {

    private String userName;
    private String password;

    private String email;

    public UserProfile(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        //setting password with simple validation by checking its length
        if(password!=null&&password.length()>5){
            this.password = password;
        }
       else {
           System.out.println("Invalid password");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        //simple validation
        if(email!=null&&email.contains("@")){
            this.email=email;
        }
       else {
           System.out.println("invalid email");
        }
    }

    public static void main(String[] args){
        UserProfile userProfile = new UserProfile("scott","sctott", "abcemail");

        System.out.println(userProfile.email);//we can access directly because within class private-scope
        userProfile.setEmail("abc");

    }
}
