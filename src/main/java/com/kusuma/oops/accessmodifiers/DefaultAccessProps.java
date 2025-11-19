package main.java.com.kusuma.oops.accessmodifiers;

public class DefaultAccessProps {
   String defStringVariable;
    int defIntVariable;

    private void display(){
        System.out.println("default variable and methods: "+defStringVariable+" : "+defStringVariable);
        PublicClassMembers publicClassMembers = new PublicClassMembers();
        publicClassMembers.publicStringVariable="public string";

        PrivateClass privateClass = new PrivateClass();
        //privateClass.psv = ""; //'psv' has private access in 'main.java.com.kusuma.oops.accessmodifiers.PrivateClass'

    }
}
