package searching;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Linear Search Algorithm");
        int arr [] = {1,2,3,4,5,6,7,8,9};

        linearSort(arr, 3);
        linearSort(arr, 10);
    }

    public static int linearSort(int[] array, int value){
        for(int i=0;i<array.length;i++){
            if(array[i]==value){
                System.out.println("Element "+value+" is found at "+i+"...");
                return i;
            }
        }
        System.out.println("Element "+value+" is not found");
        return -1;
    }
}
