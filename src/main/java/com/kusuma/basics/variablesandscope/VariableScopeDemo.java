package main.java.com.kusuma.basics.variablesandscope;

public class VariableScopeDemo {
    //1. Static/class variables: one copy per class, shared by all objects.
    // belongs to class. Access without need object creation, can access by class name.
   static int staticCounter = 0;

   //2.Instance variable belongs to object.
   int instanceCounter =0;

   static int s1 = 10;
    int l1=20;

    //final

    final int fi = 100;

    public VariableScopeDemo(){
        staticCounter++;
        instanceCounter++;
    }


    //Method(non-static): Local variables can accessible within method
    public void variableScopeTest(){
      int localVariable = 30;
      int localPlusStatic = localVariable + s1; //10+30
      int localPlusInstance = localVariable + l1; //20+30
      int all = localVariable + s1+l1; //10+20+30
      System.out.println("localPlusStatic: "+localPlusStatic + ", localPlusInstance: "+localPlusInstance+ ", localstaticinstance: "+all);
    }

    public static void test(){
        int localVariable = 30;
       int localPlusStatic = localVariable + s1; // 40
      //  int finalTotal = localVariable + s1+ f1;
       // int localPlusInstance = localVariable + l1; ////non-static cannot acceissible in static method
       //  int all = localVariable + s1+l1; ///non-static cannot acceissible in static method
        System.out.println("localPlusStatic: "+localPlusStatic );

    }

   // int outSideMethodAccess = l1+localVariable; //CT error: Cannot resolve symbol 'localVariable' because it is available within method only, outside method its not accessible
   public static void main(String[] args){

        //3. Local variable: Method level
       int localMain =10;
       new VariableScopeDemo();
       new VariableScopeDemo();

       VariableScopeDemo demo = new VariableScopeDemo();
       System.out.println("1. Static counter (class level): "+staticCounter); //3
       System.out.println("2. Instance counter (Object level): "+demo.instanceCounter); //1

       System.out.println("3. Local variable : "+localMain); //10

       demo.variableScopeTest();
       test();

       demo.l1 =  20; // can modify instance variable
       //demo.fi =  20; // final variable cannot changge

       System.out.println("4. Block Level scope (try-catch-finally) ----");
       {
           int blcokVar = 888;
           System.out.println(" Inside block: blockVar= "+blcokVar);
       }
       //System.out.println(blcokVar); //COMPILE TIME ERROR - out of scope

       // Loop Scope
       System.out.println("**** 5. Loop Scope **********");

        for(int i=0;i<=3;i++){
            int loopVar = i * 10;
            System.out.println("Loop Iteration "+i +"...loopVar: "+loopVar);
        }
        //System.out.println(i); //COMPILE ERROR
        //System.out.println(loopVar); //COMPILE ERROR

       System.out.println("***** Variable Shadowing *****");
        int x =10; //local in main
        System.out.println("Main x= "+x);

       {
           x = 20;  //shadows outer x, same name hides outer variable
           System.out.println("Inside block x= "+x); //20
       }

       class  InnerClass{
           int x =30; //shadows everything
           void print(){
               System.out.println("6. Inner class x= "+x); //30
           }
       }

       new InnerClass().print();

       System.out.println("Back in main x= "+x); // still 10


       System.out.println("7. FINAL variable: ");
       final int FINAL_VAlue = 999; //
       // FINAL_VAlue = 1000; //COMPILE ERRO
       int effectivelyFinal = 500;
      // effectivelyFinal = 600; // remove this line  -> becomes effectively final

       Runnable r = () -> {
           System.out.println("Lambda sees FINAL_VALUE: "+FINAL_VAlue);
           System.out.println("Lambda sees effectivelyFinal: "+effectivelyFinal);
       };
       r.run();

       System.out.println(" Parameter Shadowing");
       demo.display(77);

    }

    // 8. Method parameter shadows instance variable
    void display(int instanceCounter){
        System.out.println("Parameter instanceCounter= "+instanceCounter); //parameter value
        System.out.println("Actual instance variable= "+this.instanceCounter); // op: 1 -> refers to actual instance counter
    }

}

/*
1. Static counter (class level): 3
2. Instance counter (Object level): 1
3. Local variable : 10
localPlusStatic: 40, localPlusInstance: 50, localstaticinstance: 60
localPlusStatic: 40
4. Block Level scope (try-catch-finally) ----
 Inside block: blockVar= 888
**** 5. Loop Scope **********
Loop Iteration 0...loopVar: 0
Loop Iteration 1...loopVar: 10
Loop Iteration 2...loopVar: 20
Loop Iteration 3...loopVar: 30
***** Variable Shadowing *****
Main x= 10
Inside block x= 20
6. Inner class x= 30
Back in main x= 20
7. FINAL variable:
Lambda sees FINAL_VALUE: 999
Lambda sees effectivelyFinal: 500
 Parameter Shadowing
Parameter instanceCounter= 77
Actual instance variable= 1
 */
