package main.java.com.kusuma.basics.DataTypes;

public class StringExample {


    /*
    String: is collection of sequence of characters. for example: Apple is a string with collection of sequence of characters.
    //In java String is a class
    //If you directly pass value like "String greet = "Hello"; this is called string literal
    // Basically all objects will be store in heap memory. String pool is part of heap memory.
    //What is String pool?
    if you create strings as literal, jvm first check the same string value is in string pool or not, if it is not available, it will store that
    value in string pool, if it is available it will refer to the existed string value.

    //String is immutable: once create a string and if you modify/apply changes on the string, it will create another string, the existed string's state remains same.
    */

    //when you create a string object it will create in heap memory.

    /*
    How to check string pool and immutability and difference between string liternal and string pool
   */

    public static void main(String[]  args){
        String greet = "Hello";  //literal
        System.out.println("First greet: "+greet); //literal

        String str = new String("Hello"); //String object

        //String pool checking
        String greet1 = "Hello"; //exactly same value as greet
        String greet2= greet1 + "world";
        System.out.println("greet string value address: "+System.identityHashCode(greet));
        System.out.println("greet string value address: "+System.identityHashCode(greet1));
        System.out.println("greet string value address: "+System.identityHashCode(greet2));

        //check immutability
        System.out.println("Befor add any thing greet:: "+System.identityHashCode(greet));
        System.out.println("After string value address: "+System.identityHashCode(greet+" happy world!"));

        /* == and .equals()
        == is an operator that compares reference whether the objects are pointing to same location or not
        .equals()  is compare actual content of the objects.
         */
        System.out.println("________________________________________________________________________________");
        System.out.println("greet: " +greet+" and greet1: "+greet1+"  with '=' "+ (greet==greet1));
        System.out.println("gree1t: " +greet1+" and greet2: "+greet2+"  with '=' "+ (greet1==greet2));
        System.out.println("greet: " +greet+" and str obj: "+str+"  with '=' "+ (greet==str));
        System.out.println("________________________________________________________________________________");

        System.out.println("greet: " +greet+" and greet1: "+greet1+"  with '.equals()' "+ (greet.equals(greet1)));
        System.out.println("gree1t: " +greet1+" and greet2: "+greet2+"  with '.equals()' "+ (greet1.equals(greet2)));
        System.out.println("greet: " +greet+" and str obj: "+str+"  with '.equals()' "+ (greet.equals(str)));
        System.out.println("________________________________________________________________________________");

        //Other methods on string
        System.out.println("Length: "+str.length());
        System.out.println("to uppercase: "+str.toUpperCase());
        System.out.println("to lower-case: "+str.toLowerCase());
        System.out.println("to check empty/blank: "+str.isBlank()); //isEmpty()
        System.out.println("to repeat with n- times: "+str.repeat(5));
        System.out.println("to uppercase: "+str.concat(" world"));
        System.out.println("to chars: "+str.chars());
        System.out.println("to char array : "+str.toCharArray());

        String str2 = "fhgfhhkjhgdddg";
        char[] ch = str.toCharArray();
        for(char c: ch){
            System.out.print(" "+c);
        }
        System.out.println("");

        String rev = "";

        
        //other examples;
        // 1. reverse string
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        System.out.println("reverse string is: "+rev);

        char[] ch2 = str2.toCharArray();
        for(int i=0;i<ch2.length-1;i++){
            for(int j=0;j<ch2.length-1-i;j++) {
                if (ch2[j] > ch2[j + 1]) {
                    char temp = ch2[j+1];
                    ch2[j+1] = ch2[j];
                    ch2[j] = temp;
                }
            }
        }
        for(char c: ch2){
            System.out.print(" "+c);
        }
        System.out.println("");

        String[] animals= {"zebra", "monkey", "panda", "dog", "rabbit"};
        for(int i=0;i<animals.length-1;i++){
            for(int j=0;j<animals.length-1-i;j++) {
                if (animals[j].compareTo(animals[j + 1])<0) {
                    String temp = animals[j+1];
                    animals[j+1] = animals[j];
                    animals[j] = temp;
                }
            }
        }
        for(String s: animals){
            System.out.println(s);
        }

        String longString = "hello world this is string example session";
        String[] lsArray = longString.split(" ");
        //apply above for loop (write method and reuse it).

        //StringBuilder,StringBuffer : both are mutable=> won't create a new object upon modification. changes would apply on existed object.
        //The major different between string buffer and string builder is : string buffer is thread-safe(All its public methods are synchronized,. good in multi threaded environment,, prevent data corruption.
        //String builder is not thread safe. Its methods are not-synchronized. good in single threaded environment.
        //Performance wise, string builder is faster than stringbufferr due to overload with synchronization in string buffer methods.

        StringBuilder sb = new StringBuilder("hello");
        System.out.println("sb: "+System.identityHashCode(sb));
        sb.append(" hi");
        sb.append(" how");
        System.out.println("sb: "+System.identityHashCode(sb));
        sb.append(" are");
        sb.append(" you");
        System.out.println("sb: "+System.identityHashCode(sb));
        //Similar to StrinBuffer
    }
}
