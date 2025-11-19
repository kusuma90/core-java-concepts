package main.java.com.kusuma.oops.staticfinal;

//public class FinalScope extends  FinalClass { //cannot extend: Cannot inherit from final 'main.java.com.kusuma.oops.staticfinal.FinalClass'
public class FinalOverride {
    private final String dept ="CSE";
    private final String university ="ITU";

    final void display(String dept){
        System.out.println("Department is: "+dept);
    }

    final void display(String dept, String university){   //can over load final method.
        System.out.println("University is: "+university+ "and Department is: "+dept);
    }
}
