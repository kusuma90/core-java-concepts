package main.java.com.kusuma.oops.polymorphisim;

import main.java.com.kusuma.oops.inheritance.realinhertexample.Rectangle;

public class PolyTest {

    public static void main(String args[]){
     PolymorphismExamples polymorphismExamples = new PolymorphismExamples();
     polymorphismExamples.add(4,5);
     polymorphismExamples.add(4,5,6);
     polymorphismExamples.add(5.6,6.5);

     RuntimePolyExample runtimePolyExample = new RuntimePolyExample();
     runtimePolyExample.add(4,5);
    }
}
