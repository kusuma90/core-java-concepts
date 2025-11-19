package main.java.com.kusuma.oops.inheritance;

public class MultipleInheritance {
    // Java does not support multiple inheritance due to diamond problem
    // Example: Class B,Class D have same show(), and those are acquiring props from class-A. now Class D gets props from ClassB and Class C by extends those 2 classes.
    // During run time jvm gets confusion i.e which show() has to invoke, this issue called ambiguity issue.
    //So java does not support multiple inheritance directly, it supports by interface concept.
    //If you want to check create a class try extends 2 interfaces, you will see compile time error saying that java does not support multiple inheritance.
}
