package sorting;

import java.util.Arrays;
import java.util.Scanner;

//Idea of bubble sort
// uses 2 for loops and elements are compared. if i<j ok if i>j swap

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");

        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements you want to sort");
        int n = sc.nextInt();

        System.out.println("Enter elements to be sorted");
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        bubbleD(arr);
        
        System.out.println("Sorted in Descending Order");
        System.out.println(Arrays.toString(arr)); //prints [better than writing seperate method]

        bubbleA(arr);
        System.out.println("Sorted in Ascending Order");
        System.out.println(Arrays.toString(arr)); //prints [better than writing seperate method]
    }

    //bubble sort method [ascending order]
    public static void bubbleA(int[] array){
        for(int i=array.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    //bubble sort method [descending order]
    public static void bubbleD(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
