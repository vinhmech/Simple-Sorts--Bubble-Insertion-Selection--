package com.simplesort;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        SimpleSort.gen = new Random();
        SimpleSort.numbers = new int[SimpleSort.MAX_NUMBERS];

        // fill an array with number from 1 to MAX_NUMBERS = 15
        SimpleSort.fillArray();
        SimpleSort.shuffleNumbers();
        System.out.println("Array after shuffle: ");
        SimpleSort.printNumbers();

        // // sort the array with bubble sort
        // System.out.println("\nBubble sort");
        // SimpleSort.bubbleSort();
        // SimpleSort.printNumbers();

        // sort the array with selection sort
        // System.out.println("\nSelection sort");
        // SimpleSort.selectionSort();
        // SimpleSort.printNumbers();

        // sort the array with selection sort
        SimpleSort.descendingNumbers();
        System.out.println("Numbers:");
        SimpleSort.printNumbers();
        System.out.println("\nInsertion sort");
        SimpleSort.selectionSort();
        SimpleSort.printNumbers();

       //SimpleSort.nearSortedNumbers();
    }
}
