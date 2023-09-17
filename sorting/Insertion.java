package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        System.out.println("insertion sort");
        Scanner sc = new Scanner(System.in);

        System.out.println("how many elements to be sorted ?");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter the elements");
        for(int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("sorted elements are");
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] array){
        //insertion starts from second element i.e index = 1
        for(int i=1;i<array.length;i++){
            int temp = array[i];
            int j = i-1;

            while(j>-1 && temp<array[j]){ //order matters
                //                swap
                array[j+1] = array[j];
                array[j] = temp;
                //decrement the value of j by one so that we can check next position in sorted part
                j--;
            }
        }
    }
}
