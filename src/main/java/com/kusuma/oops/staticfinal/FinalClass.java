package main.java.com.kusuma.oops.staticfinal;

public final class FinalClass {
    private final String dept ="CSE";
    private final String university ="ITU";

    //try to generate getter/setters: you won't see setter option for final fields., that mean we cannot modify final variables.

    final void display(String dept){
        System.out.println("Department is: "+dept);
    }

    final void display(String dept, String university){   //can over load final method.
        System.out.println("University is: "+university+ "and Department is: "+dept);
    }

}
