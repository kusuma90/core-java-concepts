package main.java.com.kusuma.basics;

import java.io.PrintStream;

public class OperatorsDemo {
    public static void main(String[] args){
        System.out.println("Java All Operators Demo");

        int a=10, b=3, c =0, x=5;
        boolean t=true, f= false;

        //Arithmetic Operators (+ - * / % ++ --)
        System.out.println("1. Arithmetic Operators");
        System.out.println(" a + b = "+(a+b));
        System.out.println(" a - b = "+(a-b));
        System.out.println(" a * b = "+(a*b));
        System.out.println(" a / b = "+(a/b));
        System.out.println(" a % b = "+(a%b));
        System.out.println(" ++a = "+ (++a)); // increment and print 10+1
        System.out.println(" ++a = "+ (++a)); // 11+1
        System.out.println(" b-- = "+ (b--)); // 3 post decrement then b=2
        System.out.println(" b-- = "+ (b--)); // 2 post decrement then b =1

        //Relational Operators ( == != > < >= <=)
        System.out.println("2. Relational Operators: ");
        System.out.println("a==b -> " +(a==b)); //false
        System.out.println("a!=b -> " + (a!=b)); //true
        System.out.println("a>b ->" + (a>b)); //true
        System.out.println("a<b -> " + (a<b)); //false
        System.out.println("a>=b -> " + (a>=b)); //true
        System.out.println("a<=b -> " + (a<=b)); //false

        //3. Logical Operators (&& || ! & |)
        System.out.println("3. Logical Operators: ");
        System.out.println(" t && f -> "+(t&&f)); // false (short-circuit)
        System.out.println(" t ||  f -> "+(t||f)); //true
        System.out.println(" !t -> "+(!t));  //false
        System.out.println(" t & f -> "+(t&f)); //false (no short-circuit)

        //4. Bitwise Operators ( & | ^ ~ << >> >>>)
        System.out.println("4. Bitwise Operators: ");
        System.out.println(" a & b = "+(a & b)); // a= 10(1010), b= 3(0011) ( 1010 & 0010) => 0010(2)) (if both are 1 =>1 otherwise 0)
        System.out.println(" a | b = "+(a|b)); // 1010 | 0011 =>  1011 (11) (1+1=1, 0+1=1)
        System.out.println(" a ^ b = "+(a^b)); // 1010 ^ 0011 => 1001 (0+1) 9
        System.out.println(" ~a = "+(~a)); // 1010 => ~ invert all bits => -11
        System.out.println(" a<<2 = "+(a<<2));  //original 00001010 after leftshift 2 , 00101000 = 40
        System.out.println(" a>>2 = "+(a>>2)); //original 00001010 after signed rightshift with 2, 00000010 =2
        System.out.println(" a>>>2 = "+(a>>2)); // 2 unsigned right shift

        // 5. Assignment and Compound Assignment
        System.out.println("5. Compound Assignment: ");
        c = 10;
        c += 5;
        System.out.println("c += 5 -> "+c); //15
        c *=2;
        System.out.println(" c *=2-> "+c); //30
        c >>=1;
        System.out.println(" c >>=1-> "+c); //15

        //6. Ternary Operator (?:)
        System.out.println("6. Ternary Operator (?:)");
        String result = (a>b) ? " a is greater" : "b is greater";
        System.out.println("result"); //a is greater

        // 7. InstanceOf Operator
        System.out.println("7. InstanceOf Operator");
        String s=  "hello";
        System.out.println(" s instance of string -> "+(s instanceof String)); //true

        // 8. Special behavior you must know
        System.out.println("8. Tricky/interview favorites");
        //String + operator (only + is overloaded)
        System.out.println("10 + 20 = "+ 10+20); //1020 - concatenation
        System.out.println("10 + 20 = "+ (10+20)); // 10 + 20 =30

        //short-circuit vs non-short-circuit
         boolean flag = false;
         if(flag && (10/0==0)){

         }else{
             System.out.println("No ArithmeticException! (&& short-circuited)");
         }

         //post vs pre increment trick
        int i=5;
         int result1 = i++ + i++ + ++i; //
        System.out.println("i++ + i++ + ++i -> "+result1);

        System.out.println("End of operators demo");
    }
}

/*
===== Out Put ====================
Java All Operators Demo
1. Arithmetic Operators
 a + b = 13
 a - b = 7
 a * b = 30
 a / b = 3
 a % b = 1
 ++a = 11
 ++a = 12
 b-- = 3
 b-- = 2
2. Relational Operators:
a==b -> false
a!=b -> true
a>b ->true
a<b -> false
a>=b -> true
a<=b -> false
3. Logical Operators:
 t && f -> false
 t ||  f -> true
 !t -> false
 t & f -> false
4. Bitwise Operators:
 a & b = 0
 a | b = 13
 a ^ b = 13
 ~a = -13
 a<<2 = 48
 a>>2 = 3
 a>>>2 = 3
5. Compound Assignment:
c += 5 -> 15
 c *=2-> 30
 c >>=1-> 15
6. Ternary Operator (?:)
result
7. InstanceOf Operator
 s instance of string -> true
8. Tricky/interview favorites
10 + 20 = 1020
10 + 20 = 30
No ArithmeticException! (&& short-circuited)
i++ + i++ + ++i -> 19
End of operators demo
 */
