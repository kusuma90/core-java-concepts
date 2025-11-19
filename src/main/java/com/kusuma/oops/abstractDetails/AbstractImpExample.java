package main.java.com.kusuma.oops.abstractDetails;

public class AbstractImpExample extends AbstractExample{


    public AbstractImpExample(String name, int age) {
        super(name, age); //Constructor calls the parent constructor with name and age
    }

    @Override
    public void show() {
        System.out.println("Extended from Abstract class");
        System.out.println("name: "+name+" , age: "+age+" and dept is: "+dept);
    }

    public static void main(String[] args){
        //try to create an instance for AbstractExample class and check
      // AbstractExample abstractExample = new AbstractExample();  //CTE: AbstractExample' is abstract; cannot be instantiated

       AbstractExample abstractImpExample = new AbstractImpExample("james", 24);
        abstractImpExample.display();
       abstractImpExample.show();

    }
}
