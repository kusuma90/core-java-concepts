package main.java.com.kusuma.oops.constructors;

import java.lang.reflect.Constructor;

public class ConstructorExamples {
    String name;
    String nickName;

    Address address;
    //If you don't add any constructor jvm default add a default constructor with no params. if you add it, jvm invoke it.

    //Default constructor if you add :
    //to add constructor. it's name should same as class name, no return type and don't retrun anything

    //2 tyeps of constructors: 1. parameterless constructors, 2. parameterized constructor

    //1.parameterless constructors
    public ConstructorExamples(){
        System.out.println("No-args constructor");
    }

    //1.parameterized constructors
    public ConstructorExamples(String name, String nickName){
        this.name = name;   //"this" refers to current object: always points to the instance of the class which it is used.It is used to distinguish b/n instance and local variables. we can call other methods within same class. this.showDetails(), etc.
        this.nickName=nickName;
        System.out.println("name is: "+name+" and nick-name is: "+nickName);
    }

    //constructor over loading: A class have more than one constructor with differentiating no.of parameters.
    public ConstructorExamples(String name){
        super(); //refer to the immediate parent constructor. It is used in subclass to access members (Fields and methods) of its direct superclass.ex: super.parentMethod(), super.parentVariable; etc.super() is used to call constructor to explicitly call a constructor of super class.
        this.name=name;
    }

    //Shallow copy:
   /* public ConstructorExamples(ConstructorExamples shallow){
        System.out.println("Copy constructor example");
        this.name=shallow.name;
        this.nickName=shallow.nickName;
        this.address = shallow.address; //shallow copy.Copies the reference to the address object.if we modify the address object through either the Person or the copied person, the change will be reflected in both because they point to the same Address object in memory.
    }
*/

    //deep copy: copying entire object into address object not reference. so change won't affect on existed/old one.
    public ConstructorExamples(ConstructorExamples deep){
        System.out.println("Copy constructor example");
        this.name=deep.name;
        this.nickName=deep.nickName;
        this.address = new Address(deep.address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "ConstructorExamples{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
     // ConstructorExamples constructorExamples = new ConstructorExamples();
      //System.out.println("With default constructor: "+constructorExamples.toString());  //With default constructor: ConstructorExamples{name='null', nickName='null'}

     ConstructorExamples constructorExamples1 =new  ConstructorExamples("Scott", "kitty");
     System.out.println("args-constructor: "); //name is: Scott and nick-name is: kitty



    }
}
