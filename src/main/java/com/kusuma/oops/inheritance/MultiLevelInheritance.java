package main.java.com.kusuma.oops.inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args){

        System.out.println("Multi-level-Inheritance: a->b, b->c");
        Puppy puppy = new Puppy();
        puppy.eat(); //inherited from Animal (grand parent (A))
        puppy.bark(); //inherited from Dog (parent (B))
        puppy.weep(); //own method
    }
}
