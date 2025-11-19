package main.java.com.kusuma.oops.inheritance;

public class InheritanceExample {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.name="kitty";
        cat.eat(); //from animal
        cat.meow(); //from cat

        Dog dog = new Dog();
        dog.name="puppy";
        dog.eat(); //from animan
        dog.bark(); //from dog
    }
}

/*
There are 4 types of inheritance:
1. Single : one class acquire props from another class.
2. Hierarchical Inheritance:  B,C classes acquires props from Class-A.
3. Multi level: Clas acquire props from Class-B, and class-B acquire props from Class-A.
4. Multiple Inheritance: Class C gets props from Class-A and Class-B.
 */

// This class is hierarchical A -> B, A-> C