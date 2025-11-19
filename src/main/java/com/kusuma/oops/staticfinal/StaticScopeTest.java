package main.java.com.kusuma.oops.staticfinal;

public class StaticScopeTest {
    public static  void main(String args[]){
        StaticExamples staticExamples = new StaticExamples();
       System.out.println(""+staticExamples.ia); //to access instance variable need to create an object
       System.out.println(StaticExamples.sb); // for static variables, need to get by its class name
       StaticExamples.sum();
       staticExamples.add();
    }
}
