package main.java.com.kusuma.basics;

public class PrimitiveExample {

    //1. Primitive: Java has 8 primitive data types such as: byte,short,int,long, double,float,char,boolean
    //These are not objects, stored on stack, have default values.
    //2. Default values: Instance variables of primitives get default values if you don't assign them.
    byte b;
    short s;
    int i;
    long l;
    double d;
    float f;
    char c;
    boolean bool;

    //Declare variable and assign values
    byte b1=10;
    short s1=20;
    int i1=30;
    long l1=1_000_000_000L;
    double d1=100;
    float f1=3.14f;
    char c1='A';
    boolean bool1=true;

    //3. Wrapper classes: Each primitive has a wrapper (Integer for int, Double for double etc) to use in collections or when object is needed.
    Byte bw=10;
    Short sw=20;
    Integer iw=30;
    Long lw=1_000_000_000L;
    Double dw=100.0;
    Float fw=3.14f;
    Character cw='A';
    Boolean boolw=true;

    //4. Autoboxing and Unboxing
    Integer x =100; //autoboxing (java automatically converts primitive type into wrapper
    int y =x; //unboxing, manually converting from wrapper into primitive type.


    public static void main(String[] args){

        PrimitiveExample primitveExample = new PrimitiveExample(); //Created object

        //Checking what values print for those data variables.
        System.out.println("******** Checking values for variables(default) if don't assign any....");
        System.out.println("Byte value: "+primitveExample.b);
        System.out.println("Short value: "+primitveExample.s);
        System.out.println("Int value: "+primitveExample.i);
        System.out.println("Long value: "+primitveExample.l);
        System.out.println("Double value: "+primitveExample.d);
        System.out.println("Float value: "+primitveExample.f);
        System.out.println("Char value: "+primitveExample.c);
        System.out.println("Boolean value: "+primitveExample.bool);

        /*
        Checking values for variables(default) if don't assign any....
        Byte value: 0
        Short value: 0
        Int value: 0
        Long value: 0
        Double value: 0.0
        Float value: 0.0
        Char value:
        Boolean value: false
        */

        System.out.println("****** Declare and initialize instance variables**********");
        System.out.println("Byte value: "+primitveExample.b1);
        System.out.println("Short value: "+primitveExample.s1);
        System.out.println("Int value: "+primitveExample.i1);
        System.out.println("Long value: "+primitveExample.l1);
        System.out.println("Double value: "+primitveExample.d1);
        System.out.println("Float value: "+primitveExample.f1);
        System.out.println("Char value: "+primitveExample.c1);
        System.out.println("Boolean value: "+primitveExample.bool1);

        /*
        Declare and initialize instance variables
        Byte value: 10
        Short value: 20
        Int value: 30
        Long value: 1000000000
        Double value: 100.0
        Float value: 3.14
        Char value: A
        Boolean value: true
        */

        System.out.println("****** Wrapper classes **********");
        System.out.println("Byte value: "+primitveExample.bw);
        System.out.println("Short value: "+primitveExample.sw);
        System.out.println("Int value: "+primitveExample.iw);
        System.out.println("Long value: "+primitveExample.lw);
        System.out.println("Double value: "+primitveExample.dw);
        System.out.println("Float value: "+primitveExample.fw);
        System.out.println("Char value: "+primitveExample.cw);
        System.out.println("Boolean value: "+primitveExample.boolw);

        /*
        ****** Wrapper classes **********
        Byte value: 10
        Short value: 20
        Int value: 30
        Long value: 1000000000
        Double value: 100.0
        Float value: 2.8
        Char value: A
        Boolean value: true
        * */
        System.out.println("Autoboxing and Unboxing");
        System.out.println("x= "+primitveExample.x+" and y= "+primitveExample.y);
        /* Output
        Autoboxing and Unboxing
        x= 100 and y= 100
        */

        // All wrapper classes are immutable and final
        // We can check by invoking setValue
        Integer num1 = 10;
        Integer num2 =num1;
        System.out.println("*************Checking wrapper class immutability**********");

        System.out.println("Initial values");
        System.out.println("num1: "+num1+", Memory address is: "+System.identityHashCode(num1));
        System.out.println("num1: "+num2+", Memory address is: "+System.identityHashCode(num2));

        num1 = num1+5;
        System.out.println("After modifications of num1");
        System.out.println("num1: "+num1+", Memory address is: "+System.identityHashCode(num1));
        System.out.println("num1: "+num2+", Memory address is: "+System.identityHashCode(num2));

        int num3 = 10;

        System.out.println("Comparing num2 and num3 (both with value 10) :");
        System.out.println("num1: "+num2+", Memory address is: "+System.identityHashCode(num2));
        System.out.println("num1: "+num3+", Memory address is: "+System.identityHashCode(num3));

        /* 5. Immutability of wrapper classes
          Check memory addresses from output
          *************Checking wrapper class immutability**********
           Initial values
           num1: 10, Memory address is: 1848402763
           num1: 10, Memory address is: 1848402763
           After modifications of num1
           num1: 15, Memory address is: 933699219
           num1: 10, Memory address is: 1848402763
           Comparing num2 and num3 (both with value 10) :
           num1: 10, Memory address is: 1848402763
           num1: 10, Memory address is: 1848402763
         */

        // 6. Value range and over flow
        //Primitives have fixed size -> overflows wraps around (expect checked exception is strictfp).
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(max+1);
        //ouput
        /*2147483647
         -2147483648*/

        //7. IntegerCache (String pool for int)
        // Integer.valueOf() caches -128 to 127 (configurable via -XX:AutoBoxCacheMax).
        System.out.println(Integer.valueOf(-129) == Integer.valueOf(-129));
        System.out.println(Integer.valueOf(-128) == Integer.valueOf(-128));
        System.out.println(Integer.valueOf(127) == Integer.valueOf(127)); //true, cached (within range)
        System.out.println(Integer.valueOf(128) == Integer.valueOf(128)); //false not cached
        /* Output
        false
        true
        true
        false
         */

        // 8. == vs equals() with wrapper classes
        //== is an operator, compares object references whether 2 objects are referring to same location or not.
        // equals() method compares actual content of the objects.
        //== and equals() with wrappers: for Integer -128 to 127, == works because of IntegerCache, Outsdie that range, == compares reference.


        int a =100;
        int b=100;

        Integer ia = 127;
        Integer ib =127;
         System.out.println("************* == vs equals() with wrappers  ****************");
        System.out.println(a==b);  //referring to location where 100 is stored
        System.out.println(ia==ib);
        System.out.println(ia.equals(ib));

        Integer ia1 = 500;
        Integer ib1 =500;
        System.out.println(ia1==ib1);
        System.out.println(ia1.equals(ib1));

        /*
        Output:
        ************* == vs equals() with wrappers  ****************
        true
        true
        true
        false
        true
         */

        // 9. parseXyx() and valueOf()
        //ParseInt returns int(primitive), valueOf returns Integer (Object)

        int n1 = Integer.parseInt("123"); // primitive
        Integer n2 = Integer.valueOf("123"); // Object
        System.out.println(n1); //12
        System.out.println(n2); //123
        System.out.println(n1==n2);  //true

        // 10. Why prefer wrapper methods
        //Never use New Integer(5) -> creates unnecessary object. Use valueOf() or autoboxing.
        Integer n3 = new Integer(5); //deprecated and removed
        Integer n4 = Integer.valueOf(5);

        // 11. Null with wrappers
        //Primitives can't be null, wrappers van -> risk pf NullPointerException on unboxing
        Integer x = null;
        System.out.println(x); //print null
        int y =x; // java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "x" is null
    }
}
