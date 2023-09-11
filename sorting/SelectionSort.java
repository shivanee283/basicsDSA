package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        // int[] arr = {23,12,3,54,11,4,35};
        // selection(arr);
        // System.out.println(Arrays.toString(arr));
        System.out.println("Selection Sort");
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to sort");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements to be sorted");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    // selection sort method
    public static void selection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                // if the current element is less than or equal to the next one
                if (array[j] < array[minIndex]) {
                    // swap
                    minIndex = j;
                    // System.out.println("Swapping "+array[j]+" with " + array[minIndex]);
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
