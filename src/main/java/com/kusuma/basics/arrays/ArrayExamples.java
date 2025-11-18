package main.java.com.kusuma.basics.arrays;

import java.util.Scanner;

public class ArrayExamples {

    /*As of now we saw, a number/string any one input store in variable. What if we want o put group of items/elements (values) into one.
     For example: I have an apple(item/element), i put to it into String. what if i have apple,banana,cherry.... (fruits). This issue resolves with arrays concept.
     Similarly for numbers: if you want perform some operations on numbers list.
     Array: is a collection  of group of items/elements of the same type.

     */

    //Input elements from console
    public static void inputArrayElementsFomConsole(){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int i=0;
        do{
            System.out.print("Enter number at index:  "+i+ "\n");
            nums[i]=sc.nextInt();
            i++;
        }while(i<=nums.length-1);

        for(int j=0;j<=nums.length-1;j++){
            System.out.println(nums[j]);
        }
        sc.close();
    }

    //Multiplication table
    public static void multiplicationTable(int n, int t ){
        for(int i = 1; i<=t; i++){
            System.out.println(i + " * "+t +" = "+(i*t));
        }

    }
    public static void main(String[] args){

      int num = 1; //Store 1 into 1.

        // Array is a collection of group of items of the same type.
        //We need to provide size while declaring an array. Arrays have fixed size.
        //Elements stores in index based,index start from 0 to size-1; and  can access/retreive/get value by providing index or iterate the array using loops

        //Array Declaration with size '5'
        int[] numbers = new int[10]; //Here 5 is fixed size/length, can add 5 elements.

        // Manually adding/insert numbers into an array.
        numbers[0]=10;
        numbers[1]=15;
        numbers[2]=11;
        numbers[3]=18;
        numbers[4]=13;
        numbers[5]=5;
        numbers[6]=9;
        numbers[7]=2;
        numbers[8]=17;
        numbers[9]=20;

        //declaration and initialization
        int[] arr = {1,2,3,4,5}; //length is 5

        //checking defaullt values if we don't assign any.
        int[] def = new int[2];
        for(int i=0;i<=def.length-1;i++){
            System.out.println("def value at index "+ i +" is: "+def[i]); //print -> 0
        }

        //Change value
        System.out.println("Before change at 0 index: "+numbers[0]);
        numbers[0]=100;
        System.out.println("After change at 0 index: "+numbers[0]);

        // Check length of array
        System.out.println("Length of array is: "+numbers[0]);

        //Access elements
        System.out.println("number at 4th index is: "+numbers[4]); //it prints 50


        //print all numbers, instead of provide index each time to print, we can do it by array iteration using loops.

        for(int i=0;i<numbers.length-1;i++){
            System.out.println(i+"."+numbers[i]);
        }

        //inputArrayElementsFomConsole();   //Add array elements from console
      //  multiplicationTable(5,20); // 5th table multiply by 20
       // addingArrayElementsTogether(numbers);

        /*
             There are 4 types of arrays: 1D, 2D, Jagged array
             1D: 1row of elements (Linear)
             2D: (Matrix) rows, columns. ex: int[][]: we need to provide how many rows and columns for an array 2*2, 3*3, etc
            JA: each row may have different number columns.
         */

        //2D array declaration
        int[][] dArray = new int[3][3];
        //twodDarrayElements(dArray);

        //Practice coding examples
        //1. Print Even, odd, prime numbers
             eopChecking(numbers);
    }private static void addingArrayElementsTogether(int[] numbers) {
        int sum =0;
        for(int i=0;i<=numbers.length-1;i++){
            sum+=numbers[i];
        }
        System.out.println("Sum of array elements is: "+sum);

    }

    private static void twodDarrayElements(int[][] dArray) {
        Scanner sc = new Scanner(System.in);
        int length=dArray.length-1;
        for(int i=0;i<=dArray.length-1;i++){
            System.out.println("Enter elements for "+(i+1) +" row:");
            for(int j=0;j<=length;j++){
                dArray[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<=length;i++){
            for(int j=0;j<=length;j++){
                System.out.print(dArray[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void eopChecking(int[] numbers){
        System.out.print("Even numbers: ");
        for(int i=0;i<=numbers.length-1;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        System.out.println("Odd numbers: ");
        for(int i=0;i<=numbers.length-1;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        System.out.println("Prime numbers: ");
        for(int i=0;i<=numbers.length-1;i++){
            int k=0;
           for(int j=1;j<=numbers[i];j++){
               if(numbers[i]%j==0)
                   k++;
           }
           if(k==2){
               System.out.println(numbers[i] +" is prime number");
           }
        }
        System.out.println();
    }
}
