package main.java.com.kusuma.basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortingExamples {

    public static void main(String[] args) {

        //int[] array = {11,4,9,2,17,8,9,12,1,10,6,19,5,7,14,25,21,1};
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                  Select option for sorting type: 
                  1. Bubble-Sort
                  2. Selection-Sort
                  3. Insertion-Sort
                  4. Merge-Sort
                  5. Quick-Sort
                  6. Heap-Sort
                  0. for default : built-in sort
                """);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1. Selected Bubble-Sort");
                bubbleSort();
                break;
            case 2:
                System.out.println("2. Selected Selection-Sort");
                selectionSort();
                break;
            case 3:
                System.out.println("3. Insertion-Sort");
                insertionSort();
                break;
            case 4:
                System.out.println("4. Merge-Sort");
                sc.nextInt();
            case 5:
                System.out.println("5. Quick-Sort");
                break;
            case 6:
                System.out.println("6. Heap-Sort");
                break;
            default:
                System.out.println("Built in sorting ");
                builtInSorting();
                break;
        }
    }


    //Sorting using in-built methods
    private static void builtInSorting() {
        int[] array = {6, 19, 5, 7, 14, 25, 21, 1};
        //in built method: Arrays.sort() -> It uses a highly optimized algorithm that combines quick,insertion and merge sort, adopting to the data characterstics for optimal performance
        System.out.print("Before sorting.." + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sorting..." + Arrays.toString(array));
        int[] bigArray = {11, 4, 9, 2, 17, 8, 9, 12, 1, 10, 6, 19, 5, 7, 14, 25, 21, 1, 21, 34, 56, 78, 22, 45, 99, 87, 66, 44, 53, 29, 34};
        System.out.println("Before sorted big array: " + Arrays.toString(bigArray));
        Arrays.parallelSort(bigArray);
        System.out.println("After sorted big array: " + Arrays.toString(bigArray));
    }

    //Bubble sort:
    /*
       1. It is a simple sorting algorithm. It repeats the steps through the list.
       2. It compares adjacent element, and swap them if they are in wrong order. The pass through steps is repeated until no swaps are needed, which indicates the list is sorted
    */
    public static void bubbleSort() {
        // int[] array = {11,4,9,2,17,8,9,12,1,10,6,19,5,7,14,25,21,1};
        int[] array = {11, 4, 9, 2, 17, 8, 9, 12, 1, 10, 6, 19, 5, 7, 14, 25, 21, 1};
        int l = array.length;
        System.out.print("Before Sorted: " + Arrays.toString(array));
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("After sorted: " + Arrays.toString(array));
    }

    // 2. Selection - Sort
    /*
    Find out least minimum  value and swap values
    1. in first iteration, 1st index value compare all the elements of list and finds out least minimum value and swapped
    2. Repeats the step-1 through the loop/ until get list swapped
     */
    public static void selectionSort() {
        int[] sArray = {11, 4, 9, 2, 17, 8, 9, 12, 10, 6, 19, 5, 7, 14, 25, 21, 1};

        System.out.println("Before sorted: " + Arrays.toString(sArray));
        for (int i = 0; i <= sArray.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j <= sArray.length - 1; j++) {
                if (sArray[j] < sArray[min_index])
                    min_index = j;
            }
            int temp = sArray[i];
            sArray[i] = sArray[min_index];
            sArray[min_index] = temp;
        }
        System.out.println("After sorted: " + Arrays.toString(sArray));
    }

    /*
     3. Insertion Sorting
     // 1. start from 2nd element loop, compare with 1st one, based condition, values are sorted.
     // 2. loop start from 0 to 3rd element compares with 1st and 2nd values and sorted based on condtion.
     // 2nd step will be continue on further until list get sorted.
     */

    public static void insertionSort() {
        int[] instArray = {10, 6, 19, 5, 7, 14, 25, 21, 1};

        for (int i = 1; i <instArray.length; i++) {
            int k = instArray[i];
            int j = i-1;
           while (j>=0 && instArray[j]>k){
               instArray[j+1]=instArray[j];
               j--;
           }
           instArray[j+1]= k;

        }

        System.out.println("After insertion sorting: " + Arrays.toString(instArray));
    }
}


/*
 **************************  1. Bubble Sort Explanation **********************
 1. First For loop iterate the numbers one bye one from index 0 to length-1
 2. Second for loop, it take the first element to last
 3. If is condition check the first and element based on condition it would swap/no-swap

 {11,4,9,2,17,8,9,12,1,10,6,19,5,7,14,25,21,1}

 1st iterations:
 1st for loop: 0 => 11
 2nd for loop: 0 through lenght-1
 0 => 11, 1=>4 : condition (j>j+1) => (11>4) : true so it would swapp
   temp = 11;
   array[j] =array[j+1]=> array[0]=arra[1]=> 0=4
   array[j+1] = temp => array[1]=11 => 1=11
  after swap it will come out of 2nd loop
  now the array is:  {4,11,9,2,17,8,9,12,1,10,6,19,5,7,14,25,21,1}
  if condition is false it would come out loop without sorting.
  Repeats the steps until it got swapped though the loop

  Complexity:
  1: TO iterate the loop => O(n) (n is size/length of an array)
  2. For bubble sort time complexity is : O(n^2) because 2 loops (n*n iterations) for avrage and worst case
  3. If it is sorted  O(n).

  Tip:
  To check performance time: check time for entire loop execution. takenTimeToBubbeSort = startTime(put before 1st loop) - endTime(after end of first loop)
  try multiple times, and check average time to execute that entire loop.
 */

/*
OUT PUT:
Before Sorted: [11, 4, 9, 2, 17, 8, 9, 12, 1, 10, 6, 19, 5, 7, 14, 25, 21, 1]After sorted: [1, 1, 2, 4, 5, 6, 7, 8, 9, 9, 10, 11, 12, 14, 17, 19, 21, 25]
**********************************************************************************************************************************
*/

/*   SELECTION SORT

-> Again 2 loops: n*n iteration so complexity is O(n^2).
->  In selection sort: in 2nd loop, would check for minimum value, and it's index, iterate the loop end of list and store min value index
-> after 2nd loop end, min value and 1 st index value will be replaced.
 [11, 4, 9, 2, 17, 8, 9, 12, 10, 6, 19, 5, 7, 14, 25, 21, 1]
 1st iteration:  [1, 4, 9, 2, 17, 8, 9, 12, 10, 6, 19, 5, 7, 14, 25, 21, 11] 11 and 1 swapped
 2nd iteration:  [1, 2, 9, 4, 17, 8, 9, 12, 10, 6, 19, 5, 7, 14, 25, 21, 11] 2 and 9 swapped
 3rd iterations: [1, 2, 4, 9, 17, 8, 9, 12, 10, 6, 19, 5, 7, 14, 25, 21, 11] 4 and 9 swapped
 4ith iteration: [1, 2, 4, 5, 17, 8, 9, 12, 10, 6, 19, 9,  7, 14, 25, 21, 11] 4 and 5 swapped
 5th iteration:  [1, 2, 4, 5, 6,  8, 9, 12, 10, 17, 19, 9,  7, 14, 25, 21, 11]  17 and 6 swapped
 6th iteration:  [1, 2, 4, 5, 6,  7, 9, 12, 10, 17, 19, 9, 8, 14, 25, 21, 11]  8 and 7 swapped
 .......
 Out put:
 2. Selected Selection-Sort
Before sorted: [11, 4, 9, 2, 17, 8, 9, 12, 10, 6, 19, 5, 7, 14, 25, 21, 1]
After sorted: [1, 2, 4, 5, 6, 7, 8, 9, 9, 10, 11, 12, 14, 17, 19, 21, 25]
*/


/*  3. Insertion sort
 Explanation:
 i/p:  {10, 6, 19, 5, 7, 14, 25, 21, 1}
 1st iteration:
 instArray = {int[9]@968} [6, 10, 19, 5, 7, 14, 25, 21, 1]
 0 = 6
 1 = 10
 2 = 19
 3 = 5
 4 = 7
 5 = 14
 6 = 25
 7 = 21
 8 = 1
i = 1
instArray[i] = 10
instArray.length = 9

3rd iteration
instArray = {int[9]@968} [5, 6, 10, 19, 7, 14, 25, 21, 1]
 0 = 5
 1 = 6
 2 = 10
 3 = 19
 4 = 7
 5 = 14
 6 = 25
 7 = 21
 8 = 1
i = 3
instArray[i] = 19
instArray.length = 9


 */


