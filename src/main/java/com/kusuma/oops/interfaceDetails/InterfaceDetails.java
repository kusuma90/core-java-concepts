package main.java.com.kusuma.oops.interfaceDetails;


//Interface is special class type, that only has abstract methods to acheive 100% abstraction until java8 version. After java8 onwards it supports to have dfault and static methods in interface
//Interface contract: The implementing class should implement all methods that are in interface.
// Like abstract class, we cannot instantiate interface directly, but implementing call can have instatitioan on an object
//interface can allows constant variable.
//by default intrafce variables are final.
public interface InterfaceDetails {
    public void add(int a, int b);
    public void multiply(int a);
    Object getValue();

    //what if i add private method
   // private void division(int a, int b);  //Private methods in interfaces should have a body
}
