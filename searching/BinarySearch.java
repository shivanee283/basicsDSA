package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        binarySearch(arr, 4);
        binarySearch(arr, 20);
    }

    public static int binarySearch(int[] array, int value){
        int start = 0;
        int end = array.length-1;
        int middle = (start+end)/2;

        System.out.println("start: "+start+"middle: "+middle+"end: "+end);
        while((array[middle] != value && start <= end)){
            if(value<array[middle]){
                // System.out.println("Value is less than the current middle element");
                end = middle-1;
                //System.out.println("End has been updated to :"+end);
            }else{
                //System.out.println("Value is greater or equal to the current middle element");
                start = middle+1;
            }
            middle = (start+end)/2;
            System.out.println("\nStart:"+start+"\tMiddle:"+middle+"\tEnd:"+end);
        }
        if(array[middle]==value){
            System.out.println("Element "+value+" is found at index "+middle+"...");
            return middle;
        }
        else{
            System.out.println("Element "+value+" if not found :(");
            return -1;
        }
    }
}
