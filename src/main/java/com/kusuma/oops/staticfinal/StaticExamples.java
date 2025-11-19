package main.java.com.kusuma.oops.staticfinal;

public class StaticExamples {
    int ia=10; //instance variable
    static int sb=20; //local variable



    public void add(){ //non-static method
        int lc = 30; //lc
        System.out.println("sum is: "+(ia+sb+lc));  //all type of variables can be accessile in non-static method
    }

    public static void sum(){
        int ld = 40;
        System.out.println("addition is: "+(ia+sb+ld));   //ia is not accessbile because non-static variables are not allowed in static methods
    }
    public static void main(String[] args){


    }

}
