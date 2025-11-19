package main.java.com.kusuma.oops.innerclass;

public class OuterInnerClass {

    String outerName;
    private int outerAge;

    public OuterInnerClass(String outerName, int outerAge) {
        this.outerName = outerName;
        this.outerAge = outerAge;
    }

    class InnerClass{
        String dept;

        public InnerClass(String dept) {
            this.dept = dept;
        }

        //Access out class variable
        public void printDetails(){
          System.out.println("Inner class printing outer class details: "+outerName+":"+outerAge);
      }

      //inner class method which is access both outer class and inner class variables.
      public void greet(){
            System.out.println(outerName+" is belong to: "+dept);
      }
    }

    public void showDetails(){
       // System.out.println("From outer class show details: "+dept); //dept is not available in outer class because its scope is within in innerclass only.
       //But inner class, methods get access  its out class members.
    }

    public static void main(String[] args){
        OuterInnerClass innerClassExample = new OuterInnerClass("Haris", 25);
        OuterInnerClass.InnerClass innerClass = innerClassExample.new InnerClass("IT");

        innerClass.printDetails();
        innerClass.greet();
    }
}
