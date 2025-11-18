package main.java.com.kusuma.basics.controlflow;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ControlFlowExamples {

    public static void main(String[] args){

        //1. if, else if, else4
        //Evaluates a boolean expression, only one block executes, always binds to nearest if.4
        //The block code executes on based on condition
        int score = 85;
        if(score>=90){
            System.out.println("A");
        }else if(score>=80){
            System.out.println("B");
        }else{
            System.out.println("F");
        }

        //2. Switch case
        // based on input or selection, that appropriate case block statements will executed, if input is not matching with any case then will execute default block
        // Java 14+: Switch Expressions (->, yield)
        //Java 17+: Pattern Matching in switch (preview → stable)
        //Fall-through unless break, return, or ->
        //case labels must be compile-time constants
        //Allowed types: int, char, byte, short, enum, String, var (with pattern)

        //Traditional Switch
        System.out.println("Traditional Switch");
        String language = "Java";
        switch (language){
            case "Java" :
                System.out.println("Backend");
                break;
            case "Reactjs" :
                System.out.println("Front end");
                break;
            default :
                System.out.println("Software");
        }
        // 1.Classic switch
        System.out.println("1.Classic switch");
        String day = "Sunday";
        switch (day.toUpperCase()) {
            case "MONDAY", "FRIDAY" ->  System.out.println("Meeting");
            case "SATURDAY", "SUNDAY" -> System.out.println("Weekend");
            default -> System.out.println("Workday");
        }

        //2.Switch Expression (Java 14+)
        System.out.println("2.Switch Expression (Java 14+)");
        String d = "Tuesday";
        String result = switch (d.toUpperCase()){
            case "MONDAY", "FRIDAY" -> "Meeting";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Workday";
        };
       System.out.println("Switch expression result: "+result);

       // 3. Pattern Matching (Java 21)
        System.out.println("3. Pattern Matching (Java 21)");
        Object obj = 0.0; //check with string, number, null, empty(throw exception), char...
        String desc = switch (obj) {
            case null -> "Null!";
            //case String s && s.length() > 5 -> "Long string"; //20 version needed
            case String s -> "Short: " + s;
            case Integer i -> "Number: " + i;
            case Character c -> "Character: "+c;
            default -> "Unknown";
        };
        System.out.println("Pattern matching switch: "+desc);
       // for has 3 parts: initi, condition, update(increment/decrement)
        //All optional -> can be for(;;) (infinite)
        //variables init are scoped to loop
        System.out.println("************* For Loop *************");
        System.out.println("Classic for");
        for(int i=1;i<=10;i++){
            System.out.println(i + "* 10 = "+ (i*10));
        }

        System.out.println("Enhanced for (for-each");

        List<String> names = List.of("Alex", "Bob", "Combs", "Don", "Emmet");
        for(String name : names){
            System.out.println(name);
        }

        // While and do=while condiiton-based loops
        // while : check before first iteration
        // do-while: execute at least once, check after

        //while

        int attempts = 0;
        while(attempts <3){
            System.out.println("attempt# "+attempts);
            attempts++;
        }

        //do-while : The loop will execute at least once and checking condition later after do block. After onwards based on condition, iterates the loop.
        Scanner scanner = new Scanner(System.in);

        int input;
        do{
            System.out.println("Enter input: ");
            input = scanner.nextInt();
            if(input<0)
                System.out.println("Positive only");

        }while (input < 0);
        scanner.close();

        // break and continue
        //break: exit loop/switch, continue: skip to next iteration
        //labled versions for nested loops
      System.out.println("Break and Continue");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){ // for loop (has 3 parts: initialization,condition, increment/decrement). Iterate loop based on codition.
                if(j==3)
                    break;
                if(j==1)
                    continue;
                System.out.println(i +" , "+j);
            }
        }
        //forEach loop: Enhanced for loop
        List<String>  languages = Arrays.asList("Java","C","C++","C#");
        for(String lang:languages){
         System.out.println(lang);
     }
    }

}
