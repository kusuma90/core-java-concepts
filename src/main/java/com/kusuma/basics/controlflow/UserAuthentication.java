package main.java.com.kusuma.basics.controlflow;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.http.HttpClient;

public class UserAuthentication {

    private String username;
    private String password;
    private boolean isLocked;
    private HttpClient httpClient;

    public boolean login(String username, String password, boolean isLocked) {
      if(username==null || username.isBlank()){
          throw new IllegalArgumentException("Username required");
      }
      if(isLocked){
          System.out.println("Account locked, Contact Admin");
         return false;
      }
      if(password.equals("javabrain")){
          System.out.println("Successfully Logged in...");
          return true;
      }else{
          System.out.println("Incorrect password");
          return false;
      }
    }

    public String handleStatus(int code){
        return switch (code){
            case 200, 201 -> "Success";
            case 400 -> "Bad Request";
            case 401 -> "Unauthorized";
            case 404 -> "Not Found";
            case 500, 502, 503 -> "Server Error";
            default -> "Unknown: " + code;
        };
    }


    public static void main(String[] args){
        UserAuthentication userAuthentication = new UserAuthentication();
       // userAuthentication.login("","pass",true); //Exception in thread "main" java.lang.IllegalArgumentException: Username required
       // userAuthentication.login("java","pass",true); //Account locked, Contact Admin
        //userAuthentication.login("java", "wp",false);//Incorrect password
        userAuthentication.login("java", "javabrain",false); //Successfully Logged in...
        System.out.println("Stats code: "+userAuthentication.handleStatus(502)); //Stats code: Server Error
        System.out.println("Stats code: "+userAuthentication.handleStatus(0)); //Stats code: Unknown: 0
       //System.out.println( userAuthentication.fetchFromApi("https://api.github.com/users/"));


    }

}
