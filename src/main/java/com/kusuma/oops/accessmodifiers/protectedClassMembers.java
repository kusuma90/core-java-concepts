package main.java.com.kusuma.oops.accessmodifiers;

public class protectedClassMembers {
    protected  String protStringVariable;
    protected int protIntVariable;

    private void display(){
        System.out.println("private variable and methods: "+protStringVariable+" : "+protIntVariable);
    }
}
