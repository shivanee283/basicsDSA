package sorting;

public class Insertion {
    public static void main(String[] args) {
        
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
