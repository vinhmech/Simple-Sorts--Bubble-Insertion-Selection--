package com.simplesort;
import java.util.Random;


// public fianl class -- to use a class as a static class
public class SimpleSort {
    // create a test array
    // static mean a property/function can be 
    // called in main without the need to 
    // create an related object

    // attributes
    public static int[] numbers;
    public final static int MAX_NUMBERS = 15;
    public static Random gen;

    // methods

    // swap two elements in an array
    public static void swap(int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }

    // shuffle number 
    public static void shuffleNumbers (){
        int loc;
        for (int c = 0; c < MAX_NUMBERS; c++){
            loc = gen.nextInt(MAX_NUMBERS);
            swap(c, loc);
        }
    }

    // print the array of numbers
    public static void printNumbers(){
        for (int c = 0; c < MAX_NUMBERS; c++){
            System.out.printf("%d ", numbers[c]);
        }
        System.out.println();
    }

    // fill array with numbers from 1 to 15
    public static void fillArray(){
        for (int c = 0; c < MAX_NUMBERS; c++){
            numbers[c] = c + 1;
        }
    }

    // arrage array in descending order
    public static void descendingNumbers()
    {
        int n = MAX_NUMBERS;
        for (int c = 0; c < MAX_NUMBERS; c++)
            numbers[c] = n--;
    }

    // arrage array in near sort order
    public static void nearSortedNumbers()
    {
        for (int c = 0; c < MAX_NUMBERS - 1; c++)
            numbers[c] = 10 * (c + 1);
        numbers[MAX_NUMBERS - 1] = gen.nextInt(10 * MAX_NUMBERS);
    }

    // bubble sort (increasing order)
    public static void bubbleSort(){
        int compCount = 0;              // # of compare operation
        int swapCount = 0;              // # of swap
        boolean swapFlag = true;        // check if there is a swap in a loop 

        for (int i = numbers.length - 1; i > 0; i--){
            if (swapFlag == false){
                break;
            }
            swapFlag = true;
            for (int j = 0; j < i; j++){
                compCount += 3;
                if (numbers[j] > numbers[j+1]){
                    swap(j, j+1);
                    swapCount++;
                    swapFlag = true;
                }
            }
        }
        System.out.printf("CompCount: %d  SwapCount: %d\n", compCount, swapCount);
    }

    // selection sort
    public static void selectionSort(){
        int lowestValue;
        int lowestIndex;
        int swapCount = 0;
        int compCount = 0;

        for (int i = 0; i < numbers.length - 1; i++){
            lowestValue = numbers[i];
            lowestIndex = i;
            for (int j = i+1; j < numbers.length; j++)
            {
                compCount += 3;
                if (numbers[j] < lowestValue)
                {
                    lowestValue = numbers[j];
                    lowestIndex = j;
                }
            }
            swapCount++;
            swap (i, lowestIndex);
        }
        System.out.printf("CompCount: %d  SwapCount: %d\n", compCount, swapCount);
    }

    // insertion sort
    public static void insertionSort(){
        int i, j;
        int compCount = 0;
        compCount ++;

        for (i = 1; i < numbers.length; i++){
            compCount++;
            int temp = numbers[i];
            j = i;
            compCount += 2;
            while (j > 0 && numbers[j-1] >= temp){
                compCount += 2;
                numbers[j] = numbers[j-1];
                j--;
            }
            numbers[j] = temp;
        }
        System.out.printf("CompCount: %d\n", compCount);
    }
}
