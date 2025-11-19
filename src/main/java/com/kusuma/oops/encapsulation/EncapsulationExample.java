package main.java.com.kusuma.oops.encapsulation;

public class EncapsulationExample {

    private String name;  //attribute
    private  int age; //attribute

    private  double salary; //attribute


    //name attribute's behavior (public access method to get/retrieve value  from ouside class )
    public String getName() {
        return name;
    }

    //name attribute's behaviour to set value by using public setter method from outside class
    public void setName(String name) {
        this.name = name;
    }

    //age attribute's behavior (public access method to get/retrieve value from ouside class)
    public int getAge() {
        return age;
    }

    //age attribute's behaviour to set value by using public setter method from outside class
    public void setAge(int age) {
        this.age = age;
    }

    //salary attribute's behavior (public access method to get/retrieve value from ouside class)
    public double getSalary() {
        return salary;
    }

    //salary attribute's behaviour to set value by using public setter method from outside class
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args){
        UserProfile userProfile =  new UserProfile("abc","abc","abc");
      //  System.out.println(userProfile.email);//'email' has private access in 'main.java.com.kusuma.oops.encapsulation.UserProfile'
       System.out.println(userProfile.getUserName()); //with public getter we can access
        System.out.println(userProfile.getEmail());
        userProfile.setPassword("abc");  // invalid password (validating with length)
        System.out.println(userProfile.getPassword());
    }
}

/*
Encapsulation: is mechanisim of binding attributes(private data fields) and their behavior(methods) into single unti(class).
// private members cannnot accessible from outside of this class.
// public getter methods to access value
// public setter methods for set/change value
 */