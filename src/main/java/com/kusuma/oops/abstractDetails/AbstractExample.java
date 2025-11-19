package main.java.com.kusuma.oops.abstractDetails;

//Abstract: one of main principles in java. Abstraction is an mechanisim where you share high level details only and hide internal implemenation/mechanisim
//A class that has "abstract" keyword in class defenition that is abstract class.
//An abstract can have both concrete methods(partial/full implementation, abstract methods (method body)
// Abstract can be subclassed but cannot instantiate directly. A subclass that is implementing abstract class can have instance.
//An abstract class may or may not contain abstract methods, but a class that has atleast one abstract method that class should define with abstract key word in class definition.
//Abstract classes can contain various types of variables, similar to concrete class.
public abstract class  AbstractExample {
    int age;
    String name;
    static final String dept = "IT";

    public AbstractExample(String name, int age){
        this.name=name;
        this.age = age;
    }
    public void display(){
        System.out.println("Hello this is displaying from abstract-concrete method");
        System.out.println("Name: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Department is: "+dept);
    }
    public abstract void show(); // abstract method.

}
